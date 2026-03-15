package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OssApi struct {
    client *sdkhttp.Client
}

func NewOssApi(client *sdkhttp.Client) *OssApi {
    return &OssApi{client: client}
}

// Update an existing OSS bucket
func (a *OssApi) Update(body sdktypes.PlusOssBucketForm) (sdktypes.PlusApiResultPlusOssBucketVO, error) {
    raw, err := a.client.Put(BackendApiPath("/oss/bucket"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOssBucketVO](raw)
}

// Create a new OSS bucket
func (a *OssApi) Create(body sdktypes.PlusOssBucketForm) (sdktypes.PlusApiResultPlusOssBucketVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/bucket"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOssBucketVO](raw)
}

// List files
func (a *OssApi) ListFiles(query map[string]interface{}) (sdktypes.PlusApiResultFileListVO, error) {
    raw, err := a.client.Get(BackendApiPath("/oss/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileListVO](raw)
}

// Upload file
func (a *OssApi) UploadFile(body *sdktypes.UploadFileRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get upload temporary session
func (a *OssApi) GetTempSession(body sdktypes.PlusGetTempSessionForm) (sdktypes.PlusApiResultPlusTempSessionVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files/temp_session"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTempSessionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTempSessionVO](raw)
}

// Generate presigned URL
func (a *OssApi) GetPresignedUrl(body sdktypes.PlusGetPresignedUrlForm) (sdktypes.PlusApiResultGetUrlResult, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files/get_presigned_url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGetUrlResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGetUrlResult](raw)
}

// Upload file
func (a *OssApi) CreateFiles(body sdktypes.PlusUploadForm) (sdktypes.PlusApiResultPlusFileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/files/create"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusFileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusFileVO](raw)
}

// Get OSS buckets by page
func (a *OssApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOssBucketVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/bucket/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOssBucketVO](raw)
}

// Get all OSS buckets
func (a *OssApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOssBucketVO, error) {
    raw, err := a.client.Post(BackendApiPath("/oss/bucket/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOssBucketVO](raw)
}

// Get file
func (a *OssApi) GetFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/oss/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Delete file
func (a *OssApi) DeleteFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/oss/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get file content
func (a *OssApi) GetFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/oss/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// Get an OSS bucket by ID
func (a *OssApi) GetById(id string) (sdktypes.PlusApiResultPlusOssBucketVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/oss/bucket/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOssBucketVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOssBucketVO](raw)
}

// Delete an OSS bucket
func (a *OssApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/oss/bucket/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
