package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FileContentApi struct {
    client *sdkhttp.Client
}

func NewFileContentApi(client *sdkhttp.Client) *FileContentApi {
    return &FileContentApi{client: client}
}

// Update file content
func (a *FileContentApi) Update(body sdktypes.PlusFileContentForm) (sdktypes.PlusApiResultPlusFileContentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/file/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileContentVO](raw)
}

// Create file content
func (a *FileContentApi) Create(body sdktypes.PlusFileContentForm) (sdktypes.PlusApiResultPlusFileContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileContentVO](raw)
}

// Get file contents by page
func (a *FileContentApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFileContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/content/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFileContentVO](raw)
}

// Get all file contents
func (a *FileContentApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFileContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/content/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFileContentVO](raw)
}

// Get file content by ID
func (a *FileContentApi) GetById(id string) (sdktypes.PlusApiResultPlusFileContentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/file/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileContentVO](raw)
}

// Delete file content
func (a *FileContentApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/file/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
