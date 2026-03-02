package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiArticleApi struct {
    client *sdkhttp.Client
}

func NewAiArticleApi(client *sdkhttp.Client) *AiArticleApi {
    return &AiArticleApi{client: client}
}

// Update an existing AI article
func (a *AiArticleApi) Update(body sdktypes.PlusArticleForm) (sdktypes.PlusApiResultPlusArticleVO, error) {
    raw, err := a.client.Put(BackendApiPath("/article"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusArticleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusArticleVO](raw)
}

// Create a new AI article
func (a *AiArticleApi) Create(body sdktypes.PlusArticleForm) (sdktypes.PlusApiResultPlusArticleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/article"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusArticleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusArticleVO](raw)
}

// Get AI articles by page
func (a *AiArticleApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusArticleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/article/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusArticleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusArticleVO](raw)
}

// Get all AI articles
func (a *AiArticleApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusArticleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/article/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusArticleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusArticleVO](raw)
}

// Get an AI article by ID
func (a *AiArticleApi) GetById(id string) (sdktypes.PlusApiResultPlusArticleVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/article/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusArticleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusArticleVO](raw)
}

// Delete an AI article
func (a *AiArticleApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/article/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
