package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type KnowledgeBaseApi struct {
    client *sdkhttp.Client
}

func NewKnowledgeBaseApi(client *sdkhttp.Client) *KnowledgeBaseApi {
    return &KnowledgeBaseApi{client: client}
}

// Update an existing knowledge base
func (a *KnowledgeBaseApi) Update(body sdktypes.PlusKnowledgeBaseForm) (sdktypes.PlusApiResultPlusKnowledgeBaseVO, error) {
    raw, err := a.client.Put(BackendApiPath("/knowledge_base"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusKnowledgeBaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusKnowledgeBaseVO](raw)
}

// Create a new knowledge base
func (a *KnowledgeBaseApi) Create(body sdktypes.PlusKnowledgeBaseForm) (sdktypes.PlusApiResultPlusKnowledgeBaseVO, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusKnowledgeBaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusKnowledgeBaseVO](raw)
}

// Get knowledge bases by page
func (a *KnowledgeBaseApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusKnowledgeBaseVO, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusKnowledgeBaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusKnowledgeBaseVO](raw)
}

// Get all knowledge bases
func (a *KnowledgeBaseApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusKnowledgeBaseVO, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusKnowledgeBaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusKnowledgeBaseVO](raw)
}

// Get a knowledge base detail by ID
func (a *KnowledgeBaseApi) GetDetail(query map[string]interface{}) (sdktypes.PlusApiResultPlusKnowledgeBaseVO, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/get_detail"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusKnowledgeBaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusKnowledgeBaseVO](raw)
}

// List files
func (a *KnowledgeBaseApi) ListFiles(query map[string]interface{}) (sdktypes.PlusApiResultFileListVO, error) {
    raw, err := a.client.Get(BackendApiPath("/knowledge_base/files"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileListVO](raw)
}

// Upload file
func (a *KnowledgeBaseApi) UploadFile(body *sdktypes.UploadFilePostRequest, query map[string]interface{}) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/files"), body, query, nil, "multipart/form-data")
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

func (a *KnowledgeBaseApi) Stop(query map[string]interface{}, headers map[string]string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/chat/stop"), nil, query, headers, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create a chat completion with Knowledge base
func (a *KnowledgeBaseApi) CreateCompletions(body sdktypes.ChatCompletionCreateForm, query map[string]interface{}, headers map[string]string) (sdktypes.ChatCompletionChunk, error) {
    raw, err := a.client.Post(BackendApiPath("/knowledge_base/chat/completions"), body, query, headers, "")
    if err != nil {
        var zero sdktypes.ChatCompletionChunk
        return zero, err
    }
    return decodeResult[sdktypes.ChatCompletionChunk](raw)
}

// Get a knowledge base by ID
func (a *KnowledgeBaseApi) GetById(id string) (sdktypes.PlusApiResultPlusKnowledgeBaseVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/knowledge_base/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusKnowledgeBaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusKnowledgeBaseVO](raw)
}

// Delete a knowledge base
func (a *KnowledgeBaseApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/knowledge_base/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get file
func (a *KnowledgeBaseApi) GetFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/knowledge_base/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Delete file
func (a *KnowledgeBaseApi) DeleteFile(fileId string) (sdktypes.PlusApiResultFileItemVO, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/knowledge_base/files/%s", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileItemVO](raw)
}

// Get file content
func (a *KnowledgeBaseApi) GetFileContent(fileId string) (string, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/knowledge_base/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero string
        return zero, err
    }
    return decodeResult[string](raw)
}
