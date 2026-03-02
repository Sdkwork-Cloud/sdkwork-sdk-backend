package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CouponApi struct {
    client *sdkhttp.Client
}

func NewCouponApi(client *sdkhttp.Client) *CouponApi {
    return &CouponApi{client: client}
}

// Update an existing coupon template
func (a *CouponApi) Update(body sdktypes.PlusCouponForm) (sdktypes.PlusApiResultPlusCouponVO, error) {
    raw, err := a.client.Put(BackendApiPath("/coupon"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponVO](raw)
}

// Create a new coupon template
func (a *CouponApi) Create(body sdktypes.PlusCouponForm) (sdktypes.PlusApiResultPlusCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponVO](raw)
}

// Get coupon templates by page
func (a *CouponApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCouponVO](raw)
}

// Get all coupon templates
func (a *CouponApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCouponVO](raw)
}

// Get a coupon template by ID
func (a *CouponApi) GetById(id string) (sdktypes.PlusApiResultPlusCouponVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/coupon/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponVO](raw)
}

// Delete a coupon template
func (a *CouponApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/coupon/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
