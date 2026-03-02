package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AppApi struct {
    client *sdkhttp.Client
}

func NewAppApi(client *sdkhttp.Client) *AppApi {
    return &AppApi{client: client}
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

// Get app info
func (a *AppApi) GetAppInfo() (sdktypes.PlusApiResultAppInfoVO, error) {
    raw, err := a.client.Get(BackendApiPath("/app/info"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppInfoVO](raw)
}
