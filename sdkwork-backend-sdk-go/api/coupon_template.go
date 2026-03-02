package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type CouponTemplateApi struct {
    client *sdkhttp.Client
}

func NewCouponTemplateApi(client *sdkhttp.Client) *CouponTemplateApi {
    return &CouponTemplateApi{client: client}
}

// Update an existing coupon template
func (a *CouponTemplateApi) Update(body sdktypes.PlusCouponTemplateForm) (sdktypes.PlusApiResultPlusCouponTemplateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/coupon/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponTemplateVO](raw)
}

// Create a new coupon template
func (a *CouponTemplateApi) Create(body sdktypes.PlusCouponTemplateForm) (sdktypes.PlusApiResultPlusCouponTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponTemplateVO](raw)
}

// Get coupon templates by page
func (a *CouponTemplateApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCouponTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/template/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCouponTemplateVO](raw)
}

// Get all coupon templates
func (a *CouponTemplateApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCouponTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/template/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCouponTemplateVO](raw)
}

// Get a coupon template by ID
func (a *CouponTemplateApi) GetById(id string) (sdktypes.PlusApiResultPlusCouponTemplateVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/coupon/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponTemplateVO](raw)
}

// Delete a coupon template
func (a *CouponTemplateApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/coupon/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
