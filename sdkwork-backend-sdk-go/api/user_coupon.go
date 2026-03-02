package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type UserCouponApi struct {
    client *sdkhttp.Client
}

func NewUserCouponApi(client *sdkhttp.Client) *UserCouponApi {
    return &UserCouponApi{client: client}
}

// Update an existing user coupon
func (a *UserCouponApi) Update(body sdktypes.PlusUserCouponForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/coupon"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Create a new user coupon
func (a *UserCouponApi) Create(body sdktypes.PlusUserCouponForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/coupon"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Get user coupons by page
func (a *UserCouponApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/coupon/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserCouponVO](raw)
}

// Get all user coupons
func (a *UserCouponApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/coupon/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserCouponVO](raw)
}

// Get a user coupon by ID
func (a *UserCouponApi) GetById(id string) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/coupon/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Delete a user coupon
func (a *UserCouponApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/coupon/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
