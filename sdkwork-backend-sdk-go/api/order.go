package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OrderApi struct {
    client *sdkhttp.Client
}

func NewOrderApi(client *sdkhttp.Client) *OrderApi {
    return &OrderApi{client: client}
}

// Update an existing order
func (a *OrderApi) Update(body sdktypes.PlusOrderForm) (sdktypes.PlusApiResultPlusOrderVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/order"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderVO](raw)
}

// Create a new order
func (a *OrderApi) Create(body sdktypes.PlusOrderForm) (sdktypes.PlusApiResultPlusOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderVO](raw)
}

// Ship an order
func (a *OrderApi) Ship(id string, body string) (sdktypes.PlusApiResultOrderShipVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/ship", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderShipVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderShipVO](raw)
}

// Confirm an order
func (a *OrderApi) Confirm(id string) (sdktypes.PlusApiResultOrderConfirmVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/confirm", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderConfirmVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderConfirmVO](raw)
}

// Complete an order
func (a *OrderApi) Complete(id string) (sdktypes.PlusApiResultOrderCompleteVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/complete", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderCompleteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderCompleteVO](raw)
}

// Close an order
func (a *OrderApi) Close(id string) (sdktypes.PlusApiResultOrderCloseVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/close", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderCloseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderCloseVO](raw)
}

// Cancel an order
func (a *OrderApi) Cancel(id string) (sdktypes.PlusApiResultOrderCancelVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/cancel", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderCancelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderCancelVO](raw)
}

// Create virtual order
func (a *OrderApi) CreateVirtual(body sdktypes.CreateVirtualOrderForm) (sdktypes.PlusApiResultVirtualOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/virtual"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVirtualOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVirtualOrderVO](raw)
}

// Create VIP order
func (a *OrderApi) CreateVip(body sdktypes.CreateVipOrderForm) (sdktypes.PlusApiResultVipOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/vip"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipOrderVO](raw)
}

// Create points order
func (a *OrderApi) CreatePoints(body sdktypes.CreatePointsOrderForm) (sdktypes.PlusApiResultPointsOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/points"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPointsOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsOrderVO](raw)
}

// Get orders by page
func (a *OrderApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrderVO](raw)
}

// Get all orders
func (a *OrderApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrderVO](raw)
}

// Create IM group order
func (a *OrderApi) CreateImGroup(body sdktypes.CreateImGroupOrderForm) (sdktypes.PlusApiResultImGroupOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/im_group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultImGroupOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImGroupOrderVO](raw)
}

// Create goods order
func (a *OrderApi) CreateGoods(body sdktypes.CreateGoodsOrderForm) (sdktypes.PlusApiResultGoodsOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/goods"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGoodsOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGoodsOrderVO](raw)
}

// Get an order by ID
func (a *OrderApi) GetById(id string) (sdktypes.PlusApiResultPlusOrderVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/order/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderVO](raw)
}

// Delete an order
func (a *OrderApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/order/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
