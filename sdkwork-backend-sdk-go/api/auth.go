package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type AuthApi struct {
    client *sdkhttp.Client
}

func NewAuthApi(client *sdkhttp.Client) *AuthApi {
    return &AuthApi{client: client}
}

// Verify phone
func (a *AuthApi) VerifyPhone(body sdktypes.PhoneVerificationForm) (sdktypes.PlusApiResultVerificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/verification/verify_phone"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVerificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVerificationVO](raw)
}

// Verify email
func (a *AuthApi) VerifyEmail(body sdktypes.EmailVerificationForm) (sdktypes.PlusApiResultVerificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/verification/verify_email"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVerificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVerificationVO](raw)
}

// Send verification code
func (a *AuthApi) SendVerificationCode(body sdktypes.SendVerificationCodeForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/verification/send_code"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Generate login QR code
func (a *AuthApi) GenerateQrCode() (sdktypes.PlusApiResultQrCodeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/qrcode/generate"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultQrCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultQrCodeVO](raw)
}

// Confirm QR login
func (a *AuthApi) ConfirmQrCodeLogin(body sdktypes.QrCodeConfirmForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/qrcode/confirm"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Get OAuth authorization URL
func (a *AuthApi) GetAuthUrl(body sdktypes.OAuthLoginRequestForm) (sdktypes.PlusApiResultOAuthLoginResponseVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/oauth/get_auth_url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOAuthLoginResponseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOAuthLoginResponseVO](raw)
}

// Get OAuth authorization URL
func (a *AuthApi) CreateGetAuthUrl(body sdktypes.OAuthLoginRequestForm) (sdktypes.PlusApiResultOAuthLoginResponseVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/oauth/authorize"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOAuthLoginResponseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOAuthLoginResponseVO](raw)
}

// Handle OAuth callback
func (a *AuthApi) HandleCallback(body sdktypes.OAuthCallbackForm) (sdktypes.PlusApiResultLoginResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/oauth/callback"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginResultVO](raw)
}

// Check role
func (a *AuthApi) HasRole(body sdktypes.RoleCheckForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authorization/has_role"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Check permission
func (a *AuthApi) HasPermission(body sdktypes.PermissionCheckForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authorization/has_permission"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Reset password
func (a *AuthApi) ResetPassword(body sdktypes.PasswordResetForm) (sdktypes.PlusApiResultPasswordResetResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/reset_password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPasswordResetResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPasswordResetResultVO](raw)
}

// Request password reset
func (a *AuthApi) RequestPasswordReset(body sdktypes.PasswordResetRequestForm) (sdktypes.PlusApiResultPasswordResetResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/request_password_reset"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPasswordResetResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPasswordResetResultVO](raw)
}

// Register
func (a *AuthApi) Register(body sdktypes.RegisterForm) (sdktypes.PlusApiResultRegisterResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/register"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultRegisterResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRegisterResultVO](raw)
}

// Refresh token
func (a *AuthApi) RefreshToken(body sdktypes.RefreshTokenForm) (sdktypes.PlusApiResultLoginResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/refresh_token"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginResultVO](raw)
}

// Logout
func (a *AuthApi) Logout() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/logout"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Login
func (a *AuthApi) Login(body sdktypes.LoginForm) (sdktypes.LoginResultVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.LoginResultVO
        return zero, err
    }
    return decodeResult[sdktypes.LoginResultVO](raw)
}

// Change password
func (a *AuthApi) ChangePassword(body sdktypes.ChangePasswordForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/authentication/change_password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get current tenant/organization access token
func (a *AuthApi) GetCurrentAccessToken(body sdktypes.GetCurrentAccessTokenForm) (sdktypes.PlusApiResultCurrentAccessTokenVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/access_token/current"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCurrentAccessTokenVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCurrentAccessTokenVO](raw)
}

// Check QR code status
func (a *AuthApi) CheckQrCodeStatus(qrKey string) (sdktypes.PlusApiResultQrCodeStatusVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/auth/qrcode/status/%s", qrKey)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultQrCodeStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultQrCodeStatusVO](raw)
}

// Get roles
func (a *AuthApi) GetRoles() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(BackendApiPath("/auth/authorization/roles"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// Get permissions
func (a *AuthApi) GetPermissions() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(BackendApiPath("/auth/authorization/permissions"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// Get current user
func (a *AuthApi) GetCurrentUser() (sdktypes.PlusApiResultUserVO, error) {
    raw, err := a.client.Get(BackendApiPath("/auth/authentication/get_current_user"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserVO](raw)
}
