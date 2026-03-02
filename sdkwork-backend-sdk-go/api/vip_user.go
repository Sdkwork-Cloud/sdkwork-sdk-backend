package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipUserApi struct {
    client *sdkhttp.Client
}

func NewVipUserApi(client *sdkhttp.Client) *VipUserApi {
    return &VipUserApi{client: client}
}

// Update an existing VIP user
func (a *VipUserApi) Update(body sdktypes.PlusVipUserForm) (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/user"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Create a new VIP user
func (a *VipUserApi) Create(body sdktypes.PlusVipUserForm) (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Get VIP users by page
func (a *VipUserApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipUserVO](raw)
}

// Get all VIP users
func (a *VipUserApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipUserVO](raw)
}

// Get a VIP user by ID
func (a *VipUserApi) GetCurrentUser() (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user/get_current_user"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Get a VIP user by ID
func (a *VipUserApi) GetById(id string) (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/user/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Delete a VIP user
func (a *VipUserApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/user/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
