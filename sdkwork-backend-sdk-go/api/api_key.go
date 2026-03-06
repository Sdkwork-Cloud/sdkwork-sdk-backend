package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type ApiKeyApi struct {
    client *sdkhttp.Client
}

func NewApiKeyApi(client *sdkhttp.Client) *ApiKeyApi {
    return &ApiKeyApi{client: client}
}

// Update an existing API key
func (a *ApiKeyApi) Update(body sdktypes.PlusApiKeyForm) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Put(BackendApiPath("/apikey"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Create a new API key
func (a *ApiKeyApi) Create(body sdktypes.PlusApiKeyForm) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/apikey"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Get API key detail for current user
func (a *ApiKeyApi) GetMy(id string) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/apikey/my/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Update API key for current user
func (a *ApiKeyApi) UpdateMy(id string, body sdktypes.PlusApiKeySelfUpdateForm) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Put(BackendApiPath(fmt.Sprintf("/apikey/my/%s", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Delete API key for current user
func (a *ApiKeyApi) DeleteMy(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/apikey/my/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Create API key for current user
func (a *ApiKeyApi) CreateMy(body sdktypes.PlusApiKeySelfCreateForm) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/apikey/my"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Rotate API key for current user
func (a *ApiKeyApi) RotateMy(id string) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/apikey/my/%s/rotate", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Enable API key for current user
func (a *ApiKeyApi) EnableMy(id string) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/apikey/my/%s/enable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Disable API key for current user
func (a *ApiKeyApi) DisableMy(id string) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath(fmt.Sprintf("/apikey/my/%s/disable", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Get API keys by page
func (a *ApiKeyApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/apikey/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusApiKeyVO](raw)
}

// Get all API keys
func (a *ApiKeyApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusApiKeyVO, error) {
    raw, err := a.client.Post(BackendApiPath("/apikey/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusApiKeyVO](raw)
}

// Get an API key by ID
func (a *ApiKeyApi) GetById(id string) (sdktypes.PlusApiResultPlusApiKeyVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/apikey/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusApiKeyVO](raw)
}

// Delete an API key
func (a *ApiKeyApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/apikey/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// List API keys for current user
func (a *ApiKeyApi) ListMyApiKeys() (sdktypes.PlusApiResultListPlusApiKeyVO, error) {
    raw, err := a.client.Get(BackendApiPath("/apikey/my/list"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusApiKeyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusApiKeyVO](raw)
}
