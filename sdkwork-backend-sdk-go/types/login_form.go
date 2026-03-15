package types

// 鐧诲綍璇锋眰琛ㄥ崟
type LoginForm struct {
	Type string `json:"type"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Username string `json:"username"`
	Password string `json:"password"`
	Owner string `json:"owner"`
	Captcha string `json:"captcha"`
	CaptchaId string `json:"captchaId"`
	RememberMe bool `json:"rememberMe"`
	VerificationCode string `json:"verificationCode"`
	InvitationCode string `json:"invitationCode"`
}
