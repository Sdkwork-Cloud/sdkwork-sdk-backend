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

// 获取文件列表
func (a *FileApi) ListFiles(query map[string]interface{}) (sdktypes.PlusApiResultFileListVO, error) {
    raw, err := a.client.Get(BackendApiPath("/oss/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileListVO](raw)
}

// 上传文件
func (a *FileApi) Upload(body *sdktypes.UploadFileRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get upload temporary session
func (a *FileApi) GetTempSession(body sdktypes.PlusGetTempSessionForm) (sdktypes.PlusApiResultPlusTempSessionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files/temp_session"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTempSessionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTempSessionVO](raw)
}

// Generate presigned URL
func (a *FileApi) GetPresignedUrl(body sdktypes.PlusGetPresignedUrlForm) (sdktypes.PlusApiResultGetUrlResult, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files/get_presigned_url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGetUrlResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGetUrlResult](raw)
}

// Upload file
func (a *FileApi) CreateFiles(body sdktypes.PlusUploadForm) (sdktypes.PlusApiResultPlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileVO](raw)
}

// Get file metadata by page
func (a *FileApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/file/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusFileVO](raw)
}

// Get all file metadata
func (a *FileApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusFileVO, error) {
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

// 获取单个文件信息
func (a *FileApi) GetFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/oss/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// 删除文件
func (a *FileApi) DeleteFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/oss/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// 获取文件内容
func (a *FileApi) GetFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/oss/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
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
