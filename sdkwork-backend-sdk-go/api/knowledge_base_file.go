package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type KnowledgeBaseFileApi struct {
    client *sdkhttp.Client
}

func NewKnowledgeBaseFileApi(client *sdkhttp.Client) *KnowledgeBaseFileApi {
    return &KnowledgeBaseFileApi{client: client}
}

// List files
func (a *KnowledgeBaseFileApi) ListFiles(query map[string]interface{}) (sdktypes.PlusApiResultFileListVO, error) {
    raw, err := a.client.Get(BackendApiPath("/knowledge_base/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileListVO](raw)
}

// Upload file
func (a *KnowledgeBaseFileApi) UploadFile(body *sdktypes.UploadFilePostRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// List files
func (a *KnowledgeBaseFileApi) GetListFiles(query map[string]interface{}) (sdktypes.PlusApiResultFileListVO, error) {
    raw, err := a.client.Get(BackendApiPath("/disk/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileListVO](raw)
}

// Upload file
func (a *KnowledgeBaseFileApi) CreateUploadFile(body *sdktypes.CreateUploadFileRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/disk/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get file
func (a *KnowledgeBaseFileApi) GetFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/knowledge_base/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Delete file
func (a *KnowledgeBaseFileApi) DeleteFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/knowledge_base/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get file content
func (a *KnowledgeBaseFileApi) GetFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/knowledge_base/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}

// Get file
func (a *KnowledgeBaseFileApi) GetFileDisk(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Delete file
func (a *KnowledgeBaseFileApi) DeleteFileDisk(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/disk/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get file content
func (a *KnowledgeBaseFileApi) GetFileContentDisk(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/disk/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}
