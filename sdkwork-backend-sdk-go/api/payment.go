package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type PaymentApi struct {
    client *sdkhttp.Client
}

func NewPaymentApi(client *sdkhttp.Client) *PaymentApi {
    return &PaymentApi{client: client}
}

// Update an existing payment record
func (a *PaymentApi) Update(body sdktypes.PlusPaymentForm) (sdktypes.PlusApiResultPlusPaymentVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/payment"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPaymentVO](raw)
}

// Create a new payment record
func (a *PaymentApi) Create(body sdktypes.PlusPaymentForm) (sdktypes.PlusApiResultPlusPaymentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPaymentVO](raw)
}

// Check payment status
func (a *PaymentApi) CheckPaymentStatus(body sdktypes.PlusPaymentStatusQueryForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/status"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Refund payment
func (a *PaymentApi) Refund(body sdktypes.PlusRefundForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/refund"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get payment records by page
func (a *PaymentApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusPaymentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusPaymentVO](raw)
}

// Get all payment records
func (a *PaymentApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusPaymentVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusPaymentVO](raw)
}

// Cancel payment
func (a *PaymentApi) Cancel(body sdktypes.PlusPaymentCancelForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/payment/cancel"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a payment record by ID
func (a *PaymentApi) GetById(id string) (sdktypes.PlusApiResultPlusPaymentVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/payment/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusPaymentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusPaymentVO](raw)
}

// Delete a payment record
func (a *PaymentApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/payment/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
