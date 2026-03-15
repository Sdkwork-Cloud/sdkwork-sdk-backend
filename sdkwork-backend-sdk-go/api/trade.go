package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type TradeApi struct {
    client *sdkhttp.Client
}

func NewTradeApi(client *sdkhttp.Client) *TradeApi {
    return &TradeApi{client: client}
}

// Update shopping cart
func (a *TradeApi) Update(body sdktypes.PlusShoppingCartForm) (sdktypes.PlusApiResultPlusShoppingCartVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/shopping/cart"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartVO](raw)
}

// Create shopping cart
func (a *TradeApi) Create(body sdktypes.PlusShoppingCartForm) (sdktypes.PlusApiResultPlusShoppingCartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartVO](raw)
}

// Update an existing shopping cart item
func (a *TradeApi) UpdateItem(body sdktypes.PlusShoppingCartItemForm) (sdktypes.PlusApiResultPlusShoppingCartItemVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/shopping/cart/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartItemVO](raw)
}

// Create a new shopping cart item
func (a *TradeApi) CreateItem(body sdktypes.PlusShoppingCartItemForm) (sdktypes.PlusApiResultPlusShoppingCartItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartItemVO](raw)
}

// Update an existing refund record
func (a *TradeApi) UpdateRefund(body sdktypes.PlusRefundForm) (sdktypes.PlusApiResultPlusRefundVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/refund"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRefundVO](raw)
}

// Create a new refund record
func (a *TradeApi) CreateRefund(body sdktypes.PlusRefundForm) (sdktypes.PlusApiResultPlusRefundVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/refund"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRefundVO](raw)
}

// Update an existing payment record
func (a *TradeApi) UpdatePayment(body sdktypes.PlusPaymentForm) (sdktypes.PlusApiResultPlusPaymentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/payment"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPaymentVO](raw)
}

// Create a new payment record
func (a *TradeApi) CreatePayment(body sdktypes.PlusPaymentForm) (sdktypes.PlusApiResultPlusPaymentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPaymentVO](raw)
}

// Update an existing order
func (a *TradeApi) UpdateOrder(body sdktypes.PlusOrderForm) (sdktypes.PlusApiResultPlusOrderVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/order"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderVO](raw)
}

// Create a new order
func (a *TradeApi) CreateOrder(body sdktypes.PlusOrderForm) (sdktypes.PlusApiResultPlusOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderVO](raw)
}

// Update worker dispatch profile
func (a *TradeApi) UpdateWorkerDispatchProfile(body sdktypes.PlusOrderWorkerDispatchProfileForm) (sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/order/worker-dispatch-profile"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO](raw)
}

// Create worker dispatch profile
func (a *TradeApi) CreateWorkerDispatchProfile(body sdktypes.PlusOrderWorkerDispatchProfileForm) (sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/worker-dispatch-profile"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO](raw)
}

// Update an existing order item
func (a *TradeApi) UpdateItem2(body sdktypes.PlusOrderItemForm) (sdktypes.PlusApiResultPlusOrderItemVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/order/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderItemVO](raw)
}

// Create a new order item
func (a *TradeApi) CreateItem2(body sdktypes.PlusOrderItemForm) (sdktypes.PlusApiResultPlusOrderItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/item"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderItemVO](raw)
}

// Update dispatch rule
func (a *TradeApi) UpdateDispatchRule(body sdktypes.PlusOrderDispatchRuleForm) (sdktypes.PlusApiResultPlusOrderDispatchRuleVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/order/dispatch-rule"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderDispatchRuleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderDispatchRuleVO](raw)
}

// Create dispatch rule
func (a *TradeApi) CreateDispatchRule(body sdktypes.PlusOrderDispatchRuleForm) (sdktypes.PlusApiResultPlusOrderDispatchRuleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/dispatch-rule"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderDispatchRuleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderDispatchRuleVO](raw)
}

// Get shopping carts by page
func (a *TradeApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShoppingCartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShoppingCartVO](raw)
}

// Get all shopping carts
func (a *TradeApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShoppingCartVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShoppingCartVO](raw)
}

// Get shopping cart items by page
func (a *TradeApi) CreateListByPageItem(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusShoppingCartItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/item/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusShoppingCartItemVO](raw)
}

// Get all shopping cart items
func (a *TradeApi) CreateListAllEntitiesItem(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusShoppingCartItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/shopping/cart/item/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusShoppingCartItemVO](raw)
}

// Get refund records by page
func (a *TradeApi) CreateListByPageRefund(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusRefundVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/refund/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusRefundVO](raw)
}

// Get all refund records
func (a *TradeApi) CreateListAllEntitiesRefund(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusRefundVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/refund/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusRefundVO](raw)
}

// Check payment status
func (a *TradeApi) CheckPaymentStatus(body sdktypes.PlusPaymentStatusQueryForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/status"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Refund payment
func (a *TradeApi) RefundPayment(body sdktypes.PlusRefundForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/refund"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get payment records by page
func (a *TradeApi) CreateListByPagePayment(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPaymentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPaymentVO](raw)
}

// Get all payment records
func (a *TradeApi) CreateListAllEntitiesPayment(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPaymentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPaymentVO](raw)
}

// Cancel payment
func (a *TradeApi) CancelPayment(body sdktypes.PlusPaymentCancelForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/cancel"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Ship an order
func (a *TradeApi) ShipOrder(id string, body *string) (sdktypes.PlusApiResultOrderShipVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/ship", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderShipVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderShipVO](raw)
}

// Start service order
func (a *TradeApi) StartServiceOrder(id string, body *sdktypes.OrderDispatchActionForm) (sdktypes.PlusApiResultServiceOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/dispatch/start", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultServiceOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultServiceOrderVO](raw)
}

// Release service order
func (a *TradeApi) ReleaseServiceOrder(id string, body *sdktypes.OrderDispatchActionForm) (sdktypes.PlusApiResultServiceOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/dispatch/release", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultServiceOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultServiceOrderVO](raw)
}

// Complete service order
func (a *TradeApi) CompleteServiceOrder(id string, body *sdktypes.OrderDispatchActionForm) (sdktypes.PlusApiResultServiceOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/dispatch/complete", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultServiceOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultServiceOrderVO](raw)
}

// Claim service order
func (a *TradeApi) ClaimServiceOrder(id string, body *sdktypes.OrderDispatchActionForm) (sdktypes.PlusApiResultServiceOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/dispatch/claim", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultServiceOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultServiceOrderVO](raw)
}

// Assign service order
func (a *TradeApi) AssignServiceOrder(id string, body sdktypes.OrderDispatchAssignForm) (sdktypes.PlusApiResultServiceOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/dispatch/assign", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultServiceOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultServiceOrderVO](raw)
}

// Confirm an order
func (a *TradeApi) ConfirmOrder(id string) (sdktypes.PlusApiResultOrderConfirmVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/confirm", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderConfirmVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderConfirmVO](raw)
}

// Complete an order
func (a *TradeApi) CompleteOrder(id string) (sdktypes.PlusApiResultOrderCompleteVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/complete", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderCompleteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderCompleteVO](raw)
}

// Close an order
func (a *TradeApi) CloseOrder(id string) (sdktypes.PlusApiResultOrderCloseVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/close", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderCloseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderCloseVO](raw)
}

// Cancel an order
func (a *TradeApi) CancelOrder(id string) (sdktypes.PlusApiResultOrderCancelVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/trade/order/%s/cancel", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrderCancelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrderCancelVO](raw)
}

// List worker dispatch profiles by page
func (a *TradeApi) CreateListByPageWorkerDispatchProfile(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrderWorkerDispatchProfileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/worker-dispatch-profile/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrderWorkerDispatchProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrderWorkerDispatchProfileVO](raw)
}

// List all worker dispatch profiles
func (a *TradeApi) CreateListAllEntitiesWorkerDispatchProfile(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrderWorkerDispatchProfileVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/worker-dispatch-profile/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrderWorkerDispatchProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrderWorkerDispatchProfileVO](raw)
}

// Create virtual order
func (a *TradeApi) CreateVirtualOrder(body sdktypes.CreateVirtualOrderForm) (sdktypes.PlusApiResultVirtualOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/virtual"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVirtualOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVirtualOrderVO](raw)
}

// Create VIP order
func (a *TradeApi) CreateVipOrder(body sdktypes.CreateVipOrderForm) (sdktypes.PlusApiResultVipOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/vip"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipOrderVO](raw)
}

// Create service order
func (a *TradeApi) CreateServiceOrder(body sdktypes.CreateServiceOrderForm) (sdktypes.PlusApiResultServiceOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/service"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultServiceOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultServiceOrderVO](raw)
}

// Create points order
func (a *TradeApi) CreatePointsOrder(body sdktypes.CreatePointsOrderForm) (sdktypes.PlusApiResultPointsOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/points"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPointsOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPointsOrderVO](raw)
}

// Get orders by page
func (a *TradeApi) CreateListByPageOrder(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrderVO](raw)
}

// Get all orders
func (a *TradeApi) CreateListAllEntitiesOrder(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrderVO](raw)
}

// Get order items by page
func (a *TradeApi) CreateListByPageItem2(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrderItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/item/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrderItemVO](raw)
}

// Get all order items
func (a *TradeApi) CreateListAllEntitiesItem2(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrderItemVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/item/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrderItemVO](raw)
}

// Create IM group order
func (a *TradeApi) CreateImGroupOrder(body sdktypes.CreateImGroupOrderForm) (sdktypes.PlusApiResultImGroupOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/im_group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultImGroupOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImGroupOrderVO](raw)
}

// Create goods order
func (a *TradeApi) CreateGoodsOrder(body sdktypes.CreateGoodsOrderForm) (sdktypes.PlusApiResultGoodsOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/goods"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGoodsOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGoodsOrderVO](raw)
}

// List dispatch rules by page
func (a *TradeApi) CreateListByPageDispatchRule(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusOrderDispatchRuleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/dispatch-rule/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusOrderDispatchRuleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusOrderDispatchRuleVO](raw)
}

// List all dispatch rules
func (a *TradeApi) CreateListAllEntitiesDispatchRule(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusOrderDispatchRuleVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/dispatch-rule/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusOrderDispatchRuleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusOrderDispatchRuleVO](raw)
}

// Create booking order
func (a *TradeApi) CreateBookingOrder(body sdktypes.CreateBookingOrderForm) (sdktypes.PlusApiResultBookingOrderVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/order/booking"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBookingOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBookingOrderVO](raw)
}

// Get shopping cart by ID
func (a *TradeApi) GetById(id string) (sdktypes.PlusApiResultPlusShoppingCartVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartVO](raw)
}

// Delete shopping cart
func (a *TradeApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a shopping cart item by ID
func (a *TradeApi) GetByIdItem(id string) (sdktypes.PlusApiResultPlusShoppingCartItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusShoppingCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusShoppingCartItemVO](raw)
}

// Delete a shopping cart item
func (a *TradeApi) DeleteItem(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/shopping/cart/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a refund record by ID
func (a *TradeApi) GetByIdRefund(id string) (sdktypes.PlusApiResultPlusRefundVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/refund/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRefundVO](raw)
}

// Delete a refund record
func (a *TradeApi) DeleteRefund(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/refund/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a payment record by ID
func (a *TradeApi) GetByIdPayment(id string) (sdktypes.PlusApiResultPlusPaymentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/payment/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPaymentVO](raw)
}

// Delete a payment record
func (a *TradeApi) DeletePayment(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/payment/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get an order by ID
func (a *TradeApi) GetByIdOrder(id string) (sdktypes.PlusApiResultPlusOrderVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/order/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderVO](raw)
}

// Delete an order
func (a *TradeApi) DeleteOrder(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/order/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get worker dispatch profile by id
func (a *TradeApi) GetByIdWorkerDispatchProfile(id string) (sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/order/worker-dispatch-profile/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderWorkerDispatchProfileVO](raw)
}

// Delete worker dispatch profile
func (a *TradeApi) DeleteWorkerDispatchProfile(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/order/worker-dispatch-profile/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get an order item by ID
func (a *TradeApi) GetByIdItem2(id string) (sdktypes.PlusApiResultPlusOrderItemVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/order/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderItemVO](raw)
}

// Delete an order item
func (a *TradeApi) DeleteItem2(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/order/item/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get dispatch rule by id
func (a *TradeApi) GetByIdDispatchRule(id string) (sdktypes.PlusApiResultPlusOrderDispatchRuleVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/order/dispatch-rule/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusOrderDispatchRuleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusOrderDispatchRuleVO](raw)
}

// Delete dispatch rule
func (a *TradeApi) DeleteDispatchRule(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/order/dispatch-rule/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
