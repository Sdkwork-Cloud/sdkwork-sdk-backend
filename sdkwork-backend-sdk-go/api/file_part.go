package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FilePartApi struct {
    client *sdkhttp.Client
}

func NewFilePartApi(client *sdkhttp.Client) *FilePartApi {
    return &FilePartApi{client: client}
}

// Update an existing file part
func (a *FilePartApi) Update(body sdktypes.PlusFilePartForm) (sdktypes.PlusApiResultPlusFilePartVO, error) {
    raw, err := a.client.Put(BackendApiPath("/file/part"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFilePartVO](raw)
}

// Create a new file part
func (a *FilePartApi) Create(body sdktypes.PlusFilePartForm) (sdktypes.PlusApiResultPlusFilePartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/part"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFilePartVO](raw)
}

// Get file parts by page
func (a *FilePartApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFilePartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/part/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFilePartVO](raw)
}

// Get all file parts
func (a *FilePartApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFilePartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/part/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFilePartVO](raw)
}

// Get a file part by ID
func (a *FilePartApi) GetById(id string) (sdktypes.PlusApiResultPlusFilePartVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/file/part/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFilePartVO](raw)
}

// Delete a file part
func (a *FilePartApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/file/part/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
