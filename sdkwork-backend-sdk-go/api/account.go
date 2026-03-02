package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AccountApi struct {
    client *sdkhttp.Client
}

func NewAccountApi(client *sdkhttp.Client) *AccountApi {
    return &AccountApi{client: client}
}

// Update an existing account
func (a *AccountApi) Update(body sdktypes.PlusAccountForm) (sdktypes.PlusApiResultPlusAccountVO, error) {
    raw, err := a.client.Put(BackendApiPath("/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountVO](raw)
}

// Create a new account
func (a *AccountApi) Create(body sdktypes.PlusAccountForm) (sdktypes.PlusApiResultPlusAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountVO](raw)
}

// Get accounts by page
func (a *AccountApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAccountVO](raw)
}

// Get all accounts
func (a *AccountApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAccountVO](raw)
}

// Get points account
func (a *AccountApi) GetPoints(body sdktypes.PlusGetAccountForm) (sdktypes.PlusApiResultPlusAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/get_points"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountVO](raw)
}

// Get cash account
func (a *AccountApi) GetCash(body sdktypes.PlusGetAccountForm) (sdktypes.PlusApiResultPlusAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/account/get_cash"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountVO](raw)
}

// Get an account by ID
func (a *AccountApi) GetById(id string) (sdktypes.PlusApiResultPlusAccountVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAccountVO](raw)
}

// Delete an account
func (a *AccountApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
