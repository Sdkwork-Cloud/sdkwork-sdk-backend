package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AiCategoryApi struct {
    client *sdkhttp.Client
}

func NewAiCategoryApi(client *sdkhttp.Client) *AiCategoryApi {
    return &AiCategoryApi{client: client}
}

// Update an existing category
func (a *AiCategoryApi) Update(body sdktypes.PlusCategoryForm) (sdktypes.PlusApiResultPlusCategoryVO, error) {
    raw, err := a.client.Put(BackendApiPath("/category"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCategoryVO](raw)
}

// Create a new category
func (a *AiCategoryApi) Create(body sdktypes.PlusCategoryForm) (sdktypes.PlusApiResultPlusCategoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/category"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCategoryVO](raw)
}

// Get categories by page
func (a *AiCategoryApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCategoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/category/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCategoryVO](raw)
}

// Get all categories
func (a *AiCategoryApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCategoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/category/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCategoryVO](raw)
}

// Get Tree
func (a *AiCategoryApi) GetTree(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultSetPlusTreeNodePlusCategoryVO, error) {
    raw, err := a.client.Post(BackendApiPath("/category/get_tree"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSetPlusTreeNodePlusCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSetPlusTreeNodePlusCategoryVO](raw)
}

// Get a category by ID
func (a *AiCategoryApi) GetById(id string) (sdktypes.PlusApiResultPlusCategoryVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/category/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCategoryVO](raw)
}

// Delete a category
func (a *AiCategoryApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/category/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
