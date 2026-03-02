package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type UserAddressApi struct {
    client *sdkhttp.Client
}

func NewUserAddressApi(client *sdkhttp.Client) *UserAddressApi {
    return &UserAddressApi{client: client}
}

// Update an existing user address
func (a *UserAddressApi) Update(body sdktypes.PlusUserAddressForm) (sdktypes.PlusApiResultPlusUserAddressVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/address"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserAddressVO](raw)
}

// Create a new user address
func (a *UserAddressApi) Create(body sdktypes.PlusUserAddressForm) (sdktypes.PlusApiResultPlusUserAddressVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/address"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserAddressVO](raw)
}

// Get addresses by page
func (a *UserAddressApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserAddressVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/address/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserAddressVO](raw)
}

// Get all user addresses
func (a *UserAddressApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserAddressVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/address/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserAddressVO](raw)
}

// Get address by ID
func (a *UserAddressApi) GetById(id string) (sdktypes.PlusApiResultPlusUserAddressVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/address/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserAddressVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserAddressVO](raw)
}

// Delete a user address
func (a *UserAddressApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/address/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
