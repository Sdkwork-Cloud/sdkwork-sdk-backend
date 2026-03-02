package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type RefundApi struct {
    client *sdkhttp.Client
}

func NewRefundApi(client *sdkhttp.Client) *RefundApi {
    return &RefundApi{client: client}
}

// Update an existing refund record
func (a *RefundApi) Update(body sdktypes.PlusRefundForm) (sdktypes.PlusApiResultPlusRefundVO, error) {
    raw, err := a.client.Put(BackendApiPath("/trade/refund"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRefundVO](raw)
}

// Create a new refund record
func (a *RefundApi) Create(body sdktypes.PlusRefundForm) (sdktypes.PlusApiResultPlusRefundVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/refund"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRefundVO](raw)
}

// Get refund records by page
func (a *RefundApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusRefundVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/refund/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusRefundVO](raw)
}

// Get all refund records
func (a *RefundApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusRefundVO, error) {
    raw, err := a.client.Post(BackendApiPath("/trade/refund/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusRefundVO](raw)
}

// Get a refund record by ID
func (a *RefundApi) GetById(id string) (sdktypes.PlusApiResultPlusRefundVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/trade/refund/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusRefundVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusRefundVO](raw)
}

// Delete a refund record
func (a *RefundApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/trade/refund/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
