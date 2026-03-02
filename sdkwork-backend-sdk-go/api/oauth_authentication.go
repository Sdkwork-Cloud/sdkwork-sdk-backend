package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type OauthAuthenticationApi struct {
    client *sdkhttp.Client
}

func NewOauthAuthenticationApi(client *sdkhttp.Client) *OauthAuthenticationApi {
    return &OauthAuthenticationApi{client: client}
}

// Get OAuth authorization URL
func (a *OauthAuthenticationApi) GetAuthUrl(body sdktypes.OAuthLoginRequestForm) (sdktypes.OAuthLoginResponse, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/oauth/get_auth_url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OAuthLoginResponse
        return zero, err
    }
    return decodeResult[sdktypes.OAuthLoginResponse](raw)
}

// Get OAuth authorization URL
func (a *OauthAuthenticationApi) CreateGetAuthUrl(body sdktypes.OAuthLoginRequestForm) (sdktypes.OAuthLoginResponse, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/oauth/authorize"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.OAuthLoginResponse
        return zero, err
    }
    return decodeResult[sdktypes.OAuthLoginResponse](raw)
}

// Handle OAuth callback
func (a *OauthAuthenticationApi) HandleCallback(body sdktypes.OAuthCallbackForm) (sdktypes.TokenDTO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/oauth/callback"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.TokenDTO
        return zero, err
    }
    return decodeResult[sdktypes.TokenDTO](raw)
}
