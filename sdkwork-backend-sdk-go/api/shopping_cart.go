package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShoppingCartApi struct {
    client *sdkhttp.Client
}

func NewShoppingCartApi(client *sdkhttp.Client) *ShoppingCartApi {
    return &ShoppingCartApi{client: client}
}

// Update shopping cart
func (a *ShoppingCartApi) Update(body sdktypes.PlusShoppingCartForm) (sdktypes.PlusApiResultPlusShoppingCartVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/shopping/cart"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartVO](raw)
}

// Create shopping cart
func (a *ShoppingCartApi) Create(body sdktypes.PlusShoppingCartForm) (sdktypes.PlusApiResultPlusShoppingCartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartVO](raw)
}

// Get shopping carts by page
func (a *ShoppingCartApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShoppingCartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShoppingCartVO](raw)
}

// Get all shopping carts
func (a *ShoppingCartApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShoppingCartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShoppingCartVO](raw)
}

// Get shopping cart by ID
func (a *ShoppingCartApi) GetById(id string) (sdktypes.PlusApiResultPlusShoppingCartVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartVO](raw)
}

// Delete shopping cart
func (a *ShoppingCartApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
