package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AuthenticationApi struct {
    client *sdkhttp.Client
}

func NewAuthenticationApi(client *sdkhttp.Client) *AuthenticationApi {
    return &AuthenticationApi{client: client}
}

// 重置密码
func (a *AuthenticationApi) ResetPassword(body sdktypes.PasswordResetForm) (sdktypes.PlusApiResultPasswordResetResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/reset_password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPasswordResetResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPasswordResetResultVO](raw)
}

// 请求密码重置
func (a *AuthenticationApi) RequestPasswordReset(body sdktypes.PasswordResetRequestForm) (sdktypes.PlusApiResultPasswordResetResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/request_password_reset"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPasswordResetResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPasswordResetResultVO](raw)
}

// 用户注册
func (a *AuthenticationApi) Register(body sdktypes.RegisterForm) (sdktypes.PlusApiResultRegisterResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/register"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultRegisterResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRegisterResultVO](raw)
}

// 刷新访问令牌
func (a *AuthenticationApi) RefreshToken(body sdktypes.RefreshTokenForm) (sdktypes.PlusApiResultLoginResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/refresh_token"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginResultVO](raw)
}

// 退出登录
func (a *AuthenticationApi) Logout() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/logout"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 用户登录
func (a *AuthenticationApi) Login(body sdktypes.LoginForm) (sdktypes.LoginResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.LoginResultVO
        return zero, err
    }
    return decodeResult[sdktypes.LoginResultVO](raw)
}

// 修改密码
func (a *AuthenticationApi) ChangePassword(body sdktypes.ChangePasswordForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/change_password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 获取当前用户信息
func (a *AuthenticationApi) GetCurrentUser() (sdktypes.PlusApiResultUserVO, error) {
    raw, err := a.client.Get(BackendApiPath("/auth/authentication/get_current_user"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserVO](raw)
}
