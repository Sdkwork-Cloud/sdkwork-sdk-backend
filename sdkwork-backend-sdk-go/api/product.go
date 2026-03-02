package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ProductApi struct {
    client *sdkhttp.Client
}

func NewProductApi(client *sdkhttp.Client) *ProductApi {
    return &ProductApi{client: client}
}

// Update an existing product
func (a *ProductApi) Update(body sdktypes.PlusProductForm) (sdktypes.PlusApiResultPlusProductVO, error) {
    raw, err := a.client.Put(BackendApiPath("/product"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProductVO](raw)
}

// Create a new product
func (a *ProductApi) Create(body sdktypes.PlusProductForm) (sdktypes.PlusApiResultPlusProductVO, error) {
    raw, err := a.client.Post(BackendApiPath("/product"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProductVO](raw)
}

// Get all products
func (a *ProductApi) MallHome(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultPlusMallHomeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/product/mall_home"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusMallHomeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusMallHomeVO](raw)
}

// Get products by page
func (a *ProductApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusProductVO, error) {
    raw, err := a.client.Post(BackendApiPath("/product/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusProductVO](raw)
}

// Get all products
func (a *ProductApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusProductVO, error) {
    raw, err := a.client.Post(BackendApiPath("/product/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusProductVO](raw)
}

// Get a product by ID
func (a *ProductApi) GetById(id string) (sdktypes.PlusApiResultPlusProductVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/product/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProductVO](raw)
}

// Delete a product
func (a *ProductApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/product/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a product by ID
func (a *ProductApi) GetDetail(query map[string]interface{}) (sdktypes.PlusApiResultPlusProductVO, error) {
    raw, err := a.client.Get(BackendApiPath("/product/detail"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusProductVO](raw)
}
