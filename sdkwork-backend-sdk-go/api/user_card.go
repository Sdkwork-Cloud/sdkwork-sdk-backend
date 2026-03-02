package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type UserCardApi struct {
    client *sdkhttp.Client
}

func NewUserCardApi(client *sdkhttp.Client) *UserCardApi {
    return &UserCardApi{client: client}
}

// Update user-card binding
func (a *UserCardApi) Update(body sdktypes.PlusUserCardForm) (sdktypes.PlusApiResultPlusUserCardVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCardVO](raw)
}

// Create user-card binding
func (a *UserCardApi) Create(body sdktypes.PlusUserCardForm) (sdktypes.PlusApiResultPlusUserCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/card"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCardVO](raw)
}

// Get user-card bindings by page
func (a *UserCardApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/card/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserCardVO](raw)
}

// Get all user-card bindings
func (a *UserCardApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserCardVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/card/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserCardVO](raw)
}

// Get user-card binding by ID
func (a *UserCardApi) GetById(id string) (sdktypes.PlusApiResultPlusUserCardVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserCardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserCardVO](raw)
}

// Delete user-card binding
func (a *UserCardApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/card/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
