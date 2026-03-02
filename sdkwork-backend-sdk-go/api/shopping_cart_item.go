package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ShoppingCartItemApi struct {
    client *sdkhttp.Client
}

func NewShoppingCartItemApi(client *sdkhttp.Client) *ShoppingCartItemApi {
    return &ShoppingCartItemApi{client: client}
}

// Update an existing shopping cart item
func (a *ShoppingCartItemApi) Update(body sdktypes.PlusShoppingCartItemForm) (sdktypes.PlusApiResultPlusShoppingCartItemVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/shopping/cart/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartItemVO](raw)
}

// Create a new shopping cart item
func (a *ShoppingCartItemApi) Create(body sdktypes.PlusShoppingCartItemForm) (sdktypes.PlusApiResultPlusShoppingCartItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartItemVO](raw)
}

// Get shopping cart items by page
func (a *ShoppingCartItemApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShoppingCartItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/item/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShoppingCartItemVO](raw)
}

// Get all shopping cart items
func (a *ShoppingCartItemApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShoppingCartItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/item/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShoppingCartItemVO](raw)
}

// Get a shopping cart item by ID
func (a *ShoppingCartItemApi) GetById(id string) (sdktypes.PlusApiResultPlusShoppingCartItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartItemVO](raw)
}

// Delete a shopping cart item
func (a *ShoppingCartItemApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
