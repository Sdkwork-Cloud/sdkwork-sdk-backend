package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AppApi struct {
    client *sdkhttp.Client
}

func NewAppApi(client *sdkhttp.Client) *AppApi {
    return &AppApi{client: client}
}

// Update application
func (a *AppApi) Update(body sdktypes.PlusAppForm) (sdktypes.PlusApiResultPlusAppVO, error) {
    raw, err := a.client.Put(BackendApiPath("/app"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAppVO](raw)
}

// Create application
func (a *AppApi) Create(body sdktypes.PlusAppForm) (sdktypes.PlusApiResultPlusAppVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAppVO](raw)
}

// Get applications by page
func (a *AppApi) ListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusAppVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusAppVO](raw)
}

// Get all applications
func (a *AppApi) ListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusAppVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusAppVO](raw)
}

// Get app SDK config
func (a *AppApi) GetSdkConfig(body sdktypes.CreateJsapiSignatureForm) (sdktypes.PlusApiResultAppSdkConfigVO, error) {
    raw, err := a.client.Post(BackendApiPath("/app/get_sdk_config"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAppSdkConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppSdkConfigVO](raw)
}

// Get application by ID
func (a *AppApi) GetById(id string) (sdktypes.PlusApiResultPlusAppVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/app/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusAppVO](raw)
}

// Delete application
func (a *AppApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/app/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get app info
func (a *AppApi) GetAppInfo() (sdktypes.PlusApiResultAppInfoVO, error) {
    raw, err := a.client.Get(BackendApiPath("/app/info"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppInfoVO](raw)
}
