package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type UserApi struct {
    client *sdkhttp.Client
}

func NewUserApi(client *sdkhttp.Client) *UserApi {
    return &UserApi{client: client}
}

// Update an existing user
func (a *UserApi) Update(body sdktypes.PlusUserForm) (sdktypes.PlusApiResultPlusUserVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserVO](raw)
}

// Create a new user
func (a *UserApi) Create(body sdktypes.PlusUserForm) (sdktypes.PlusApiResultPlusUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserVO](raw)
}

// Update user OAuth account
func (a *UserApi) UpdateAccount(body sdktypes.PlusUserOAuthAccountForm) (sdktypes.PlusApiResultPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/oauth/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserOAuthAccountVO](raw)
}

// Create user OAuth account
func (a *UserApi) CreateAccount(body sdktypes.PlusUserOAuthAccountForm) (sdktypes.PlusApiResultPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/oauth/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserOAuthAccountVO](raw)
}

// Update an existing user coupon
func (a *UserApi) UpdateCoupon(body sdktypes.PlusUserCouponForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/coupon"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Create a new user coupon
func (a *UserApi) CreateCoupon(body sdktypes.PlusUserCouponForm) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/coupon"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Update user-card binding
func (a *UserApi) UpdateCard(body sdktypes.PlusUserCardForm) (sdktypes.PlusApiResultPlusUserCardVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCardVO](raw)
}

// Create user-card binding
func (a *UserApi) CreateCard(body sdktypes.PlusUserCardForm) (sdktypes.PlusApiResultPlusUserCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCardVO](raw)
}

// Update an existing user address
func (a *UserApi) UpdateAddress(body sdktypes.PlusUserAddressForm) (sdktypes.PlusApiResultPlusUserAddressVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/address"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserAddressVO](raw)
}

// Create a new user address
func (a *UserApi) CreateAddress(body sdktypes.PlusUserAddressForm) (sdktypes.PlusApiResultPlusUserAddressVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/address"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserAddressVO](raw)
}

// Get user OAuth accounts by page
func (a *UserApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserOAuthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/oauth/account/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserOAuthAccountVO](raw)
}

// Get all user OAuth accounts
func (a *UserApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/oauth/account/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserOAuthAccountVO](raw)
}

// Get users by page
func (a *UserApi) CreateListByPageUser(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserVO](raw)
}

// Get all users
func (a *UserApi) CreateListAllEntitiesUser(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserVO](raw)
}

// Get user coupons by page
func (a *UserApi) CreateListByPageCoupon(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/coupon/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserCouponVO](raw)
}

// Get all user coupons
func (a *UserApi) CreateListAllEntitiesCoupon(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserCouponVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/coupon/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserCouponVO](raw)
}

// Get user-card bindings by page
func (a *UserApi) CreateListByPageCard(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/card/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserCardVO](raw)
}

// Get all user-card bindings
func (a *UserApi) CreateListAllEntitiesCard(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/card/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserCardVO](raw)
}

// Get addresses by page
func (a *UserApi) CreateListByPageAddress(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserAddressVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/address/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserAddressVO](raw)
}

// Get all user addresses
func (a *UserApi) CreateListAllEntitiesAddress(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserAddressVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/address/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserAddressVO](raw)
}

// Get a user by ID
func (a *UserApi) GetById(id string) (sdktypes.PlusApiResultPlusUserVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserVO](raw)
}

// Delete a user
func (a *UserApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get current user profile
func (a *UserApi) GetProfile() (sdktypes.PlusApiResultPlusUserProfileVO, error) {
    raw, err := a.client.Get(BackendApiPath("/user/profile"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserProfileVO](raw)
}

// Get user OAuth account by ID
func (a *UserApi) GetByIdAccount(id string) (sdktypes.PlusApiResultPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/oauth/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserOAuthAccountVO](raw)
}

// Delete user OAuth account
func (a *UserApi) DeleteAccount(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/oauth/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a user coupon by ID
func (a *UserApi) GetByIdCoupon(id string) (sdktypes.PlusApiResultPlusUserCouponVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/coupon/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCouponVO](raw)
}

// Delete a user coupon
func (a *UserApi) DeleteCoupon(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/coupon/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get user-card binding by ID
func (a *UserApi) GetByIdCard(id string) (sdktypes.PlusApiResultPlusUserCardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCardVO](raw)
}

// Delete user-card binding
func (a *UserApi) DeleteCard(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get address by ID
func (a *UserApi) GetByIdAddress(id string) (sdktypes.PlusApiResultPlusUserAddressVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/address/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserAddressVO](raw)
}

// Delete a user address
func (a *UserApi) DeleteAddress(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/address/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
