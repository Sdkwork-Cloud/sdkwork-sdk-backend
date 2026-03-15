package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type SystemApi struct {
    client *sdkhttp.Client
}

func NewSystemApi(client *sdkhttp.Client) *SystemApi {
    return &SystemApi{client: client}
}

// Apply invoice
func (a *SystemApi) Apply(body sdktypes.PlusSystemInvoiceApplyForm) (sdktypes.PlusApiResultPlusSystemInvoiceVO, error) {
    raw, err := a.client.Post(BackendApiPath("/system/invoice/apply"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusSystemInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusSystemInvoiceVO](raw)
}

// Query invoice page
func (a *SystemApi) ListByPage(query map[string]interface{}) (sdktypes.PlusApiResultPagePlusSystemInvoiceVO, error) {
    raw, err := a.client.Get(BackendApiPath("/system/invoice/page"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusSystemInvoiceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusSystemInvoiceVO](raw)
}
