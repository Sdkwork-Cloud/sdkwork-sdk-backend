package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShopApi struct {
    client *sdkhttp.Client
}

func NewShopApi(client *sdkhttp.Client) *ShopApi {
    return &ShopApi{client: client}
}

// Update an existing shop
func (a *ShopApi) Update(body sdktypes.PlusShopForm) (sdktypes.PlusApiResultPlusShopVO, error) {
    raw, err := a.client.Put(BackendApiPath("/shop"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShopVO](raw)
}

// Create a new shop
func (a *ShopApi) Create(body sdktypes.PlusShopForm) (sdktypes.PlusApiResultPlusShopVO, error) {
    raw, err := a.client.Post(BackendApiPath("/shop"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShopVO](raw)
}

// Get shops by page
func (a *ShopApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShopVO, error) {
    raw, err := a.client.Post(BackendApiPath("/shop/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShopVO](raw)
}

// Get all shops
func (a *ShopApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShopVO, error) {
    raw, err := a.client.Post(BackendApiPath("/shop/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShopVO](raw)
}

// Get a shop by ID
func (a *ShopApi) GetById(id string) (sdktypes.PlusApiResultPlusShopVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/shop/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShopVO](raw)
}

// Delete a shop
func (a *ShopApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/shop/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
