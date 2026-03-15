package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type FileApi struct {
    client *sdkhttp.Client
}

func NewFileApi(client *sdkhttp.Client) *FileApi {
    return &FileApi{client: client}
}

// Update existing file metadata
func (a *FileApi) Update(body sdktypes.PlusFileForm) (sdktypes.PlusApiResultPlusFileVO, error) {
    raw, err := a.client.Put(BackendApiPath("/file"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileVO](raw)
}

// Create a new file metadata
func (a *FileApi) Create(body sdktypes.PlusFileForm) (sdktypes.PlusApiResultPlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileVO](raw)
}

// Update an existing file part
func (a *FileApi) UpdatePart(body sdktypes.PlusFilePartForm) (sdktypes.PlusApiResultPlusFilePartVO, error) {
    raw, err := a.client.Put(BackendApiPath("/file/part"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFilePartVO](raw)
}

// Create a new file part
func (a *FileApi) CreatePart(body sdktypes.PlusFilePartForm) (sdktypes.PlusApiResultPlusFilePartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/part"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFilePartVO](raw)
}

// Update file content
func (a *FileApi) UpdateContent(body sdktypes.PlusFileContentForm) (sdktypes.PlusApiResultPlusFileContentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/file/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileContentVO](raw)
}

// Create file content
func (a *FileApi) CreateContent(body sdktypes.PlusFileContentForm) (sdktypes.PlusApiResultPlusFileContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileContentVO](raw)
}

// Get file parts by page
func (a *FileApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFilePartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/part/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFilePartVO](raw)
}

// Get all file parts
func (a *FileApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFilePartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/part/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFilePartVO](raw)
}

// Get file metadata by page
func (a *FileApi) CreateListByPageFile(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFileVO](raw)
}

// Get all file metadata
func (a *FileApi) CreateListAllEntitiesFile(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFileVO](raw)
}

// Get Tree
func (a *FileApi) GetTree(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultSetPlusTreeNodePlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/get_tree"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSetPlusTreeNodePlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSetPlusTreeNodePlusFileVO](raw)
}

// Get file contents by page
func (a *FileApi) CreateListByPageContent(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFileContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/content/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFileContentVO](raw)
}

// Get all file contents
func (a *FileApi) CreateListAllEntitiesContent(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFileContentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/content/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusFileContentVO](raw)
}

// Get file metadata by ID
func (a *FileApi) GetById(id string) (sdktypes.PlusApiResultPlusFileVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/file/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileVO](raw)
}

// Delete file metadata
func (a *FileApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/file/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a file part by ID
func (a *FileApi) GetByIdPart(id string) (sdktypes.PlusApiResultPlusFilePartVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/file/part/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFilePartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFilePartVO](raw)
}

// Delete a file part
func (a *FileApi) DeletePart(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/file/part/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get file content by ID
func (a *FileApi) GetByIdContent(id string) (sdktypes.PlusApiResultPlusFileContentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/file/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileContentVO](raw)
}

// Delete file content
func (a *FileApi) DeleteContent(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/file/content/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
