package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OrderItemApi struct {
    client *sdkhttp.Client
}

func NewOrderItemApi(client *sdkhttp.Client) *OrderItemApi {
    return &OrderItemApi{client: client}
}

// Update an existing order item
func (a *OrderItemApi) Update(body sdktypes.PlusOrderItemForm) (sdktypes.PlusApiResultPlusOrderItemVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/order/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderItemVO](raw)
}

// Create a new order item
func (a *OrderItemApi) Create(body sdktypes.PlusOrderItemForm) (sdktypes.PlusApiResultPlusOrderItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderItemVO](raw)
}

// Get order items by page
func (a *OrderItemApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrderItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/item/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrderItemVO](raw)
}

// Get all order items
func (a *OrderItemApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrderItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/item/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrderItemVO](raw)
}

// Get an order item by ID
func (a *OrderItemApi) GetById(id string) (sdktypes.PlusApiResultPlusOrderItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/order/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderItemVO](raw)
}

// Delete an order item
func (a *OrderItemApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/order/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
