package api

import (
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VerificationApi struct {
    client *sdkhttp.Client
}

func NewVerificationApi(client *sdkhttp.Client) *VerificationApi {
    return &VerificationApi{client: client}
}

// Verify phone
func (a *VerificationApi) VerifyPhone(body sdktypes.PhoneVerificationForm) (sdktypes.PlusApiResultVerificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/verification/verify_phone"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVerificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVerificationVO](raw)
}

// Verify email
func (a *VerificationApi) VerifyEmail(body sdktypes.EmailVerificationForm) (sdktypes.PlusApiResultVerificationVO, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/verification/verify_email"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVerificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVerificationVO](raw)
}

// Send verification code
func (a *VerificationApi) SendVerificationCode(body sdktypes.SendVerificationCodeForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(BackendApiPath("/auth/verification/send_code"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
