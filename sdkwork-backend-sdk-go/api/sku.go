package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SkuApi struct {
    client *sdkhttp.Client
}

func NewSkuApi(client *sdkhttp.Client) *SkuApi {
    return &SkuApi{client: client}
}

// Update an existing SKU
func (a *SkuApi) Update(body sdktypes.PlusSkuForm) (sdktypes.PlusApiResultPlusSkuVO, error) {
    raw, err := a.client.Put(BackendApiPath("/sku"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSkuVO](raw)
}

// Create a new SKU
func (a *SkuApi) Create(body sdktypes.PlusSkuForm) (sdktypes.PlusApiResultPlusSkuVO, error) {
    raw, err := a.client.Post(BackendApiPath("/sku"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSkuVO](raw)
}

// Get SKUs by page
func (a *SkuApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusSkuVO, error) {
    raw, err := a.client.Post(BackendApiPath("/sku/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusSkuVO](raw)
}

// Get all SKUs
func (a *SkuApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusSkuVO, error) {
    raw, err := a.client.Post(BackendApiPath("/sku/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusSkuVO](raw)
}

// Get an SKU by ID
func (a *SkuApi) GetById(id string) (sdktypes.PlusApiResultPlusSkuVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/sku/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSkuVO](raw)
}

// Delete an SKU
func (a *SkuApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/sku/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
