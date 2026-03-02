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

// Get users by page
func (a *UserApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserVO](raw)
}

// Get all users
func (a *UserApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserVO](raw)
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
