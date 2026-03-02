package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type TenantApi struct {
    client *sdkhttp.Client
}

func NewTenantApi(client *sdkhttp.Client) *TenantApi {
    return &TenantApi{client: client}
}

// Update an existing tenant
func (a *TenantApi) Update(body sdktypes.PlusTenantForm) (sdktypes.PlusApiResultPlusTenantVO, error) {
    raw, err := a.client.Put(BackendApiPath("/tenant"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTenantVO](raw)
}

// Create a new tenant
func (a *TenantApi) Create(body sdktypes.PlusTenantForm) (sdktypes.PlusApiResultPlusTenantVO, error) {
    raw, err := a.client.Post(BackendApiPath("/tenant"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTenantVO](raw)
}

// Uninstall app from tenant
func (a *TenantApi) Uninstall(id string, body sdktypes.PlusTenantForm) (sdktypes.PlusApiResultPlusTenantVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/tenant/%s/uninstall", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTenantVO](raw)
}

// Install app for tenant
func (a *TenantApi) Install(id string, body sdktypes.PlusTenantForm) (sdktypes.PlusApiResultPlusTenantVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/tenant/%s/install", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTenantVO](raw)
}

// Get tenants by page
func (a *TenantApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusTenantVO, error) {
    raw, err := a.client.Post(BackendApiPath("/tenant/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusTenantVO](raw)
}

// Get all tenants
func (a *TenantApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusTenantVO, error) {
    raw, err := a.client.Post(BackendApiPath("/tenant/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusTenantVO](raw)
}

// Get access tokens
func (a *TenantApi) GetAccessTokens(body sdktypes.GetAccessTokenForm) (sdktypes.PlusApiResultListTokenResult, error) {
    raw, err := a.client.Post(BackendApiPath("/tenant/get_access_tokens"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListTokenResult
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTokenResult](raw)
}

// Get a tenant by ID
func (a *TenantApi) GetById(id string) (sdktypes.PlusApiResultPlusTenantVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/tenant/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusTenantVO](raw)
}

// Delete a tenant
func (a *TenantApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/tenant/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
