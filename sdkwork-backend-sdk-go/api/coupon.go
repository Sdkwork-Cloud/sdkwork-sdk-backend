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

// Update an existing coupon template
func (a *CouponApi) UpdateTemplate(body sdktypes.PlusCouponTemplateForm) (sdktypes.PlusApiResultPlusCouponTemplateVO, error) {
    raw, err := a.client.Put(BackendApiPath("/coupon/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponTemplateVO](raw)
}

// Create a new coupon template
func (a *CouponApi) CreateTemplate(body sdktypes.PlusCouponTemplateForm) (sdktypes.PlusApiResultPlusCouponTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/template"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponTemplateVO](raw)
}

// Exchange coupon by points
func (a *CouponApi) ExchangeByPoints(couponId string, body sdktypes.CouponPointsExchangeForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/coupon/%s/exchange/points", couponId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Get coupon templates by page
func (a *CouponApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCouponTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/template/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCouponTemplateVO](raw)
}

// Get all coupon templates
func (a *CouponApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCouponTemplateVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/template/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusCouponTemplateVO](raw)
}

// Redeem coupon
func (a *CouponApi) Redeem(body sdktypes.CouponRedeemForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/redeem"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Rollback points exchange coupon
func (a *CouponApi) RollbackPointsExchange(userCouponId string, body *sdktypes.CouponRollbackForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/coupon/my/%s/rollback", userCouponId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Get coupon templates by page
func (a *CouponApi) CreateListByPageCoupon(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/coupon/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusCouponVO](raw)
}

// Get all coupon templates
func (a *CouponApi) CreateListAllEntitiesCoupon(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusCouponVO, error) {
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

// Get a coupon template by ID
func (a *CouponApi) GetByIdTemplate(id string) (sdktypes.PlusApiResultPlusCouponTemplateVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/coupon/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusCouponTemplateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusCouponTemplateVO](raw)
}

// Delete a coupon template
func (a *CouponApi) DeleteTemplate(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/coupon/template/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
