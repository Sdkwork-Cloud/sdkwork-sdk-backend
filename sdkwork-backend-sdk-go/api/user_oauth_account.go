package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type UserOauthAccountApi struct {
    client *sdkhttp.Client
}

func NewUserOauthAccountApi(client *sdkhttp.Client) *UserOauthAccountApi {
    return &UserOauthAccountApi{client: client}
}

// Update user OAuth account
func (a *UserOauthAccountApi) Update(body sdktypes.PlusUserOAuthAccountForm) (sdktypes.PlusApiResultPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Put(BackendApiPath("/user/oauth/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserOAuthAccountVO](raw)
}

// Create user OAuth account
func (a *UserOauthAccountApi) Create(body sdktypes.PlusUserOAuthAccountForm) (sdktypes.PlusApiResultPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/oauth/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserOAuthAccountVO](raw)
}

// Get user OAuth accounts by page
func (a *UserOauthAccountApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusUserOAuthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/oauth/account/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusUserOAuthAccountVO](raw)
}

// Get all user OAuth accounts
func (a *UserOauthAccountApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Post(BackendApiPath("/user/oauth/account/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusUserOAuthAccountVO](raw)
}

// Get user OAuth account by ID
func (a *UserOauthAccountApi) GetById(id string) (sdktypes.PlusApiResultPlusUserOAuthAccountVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/user/oauth/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusUserOAuthAccountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusUserOAuthAccountVO](raw)
}

// Delete user OAuth account
func (a *UserOauthAccountApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/user/oauth/account/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
