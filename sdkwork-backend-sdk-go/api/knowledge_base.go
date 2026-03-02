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
