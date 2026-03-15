package types

// 鐢ㄦ埛娉ㄥ唽璇锋眰琛ㄥ崟
type RegisterForm struct {
	Username string `json:"username"`
	Password string `json:"password"`
	ConfirmPassword string `json:"confirmPassword"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Captcha string `json:"captcha"`
	CaptchaId string `json:"captchaId"`
	Type string `json:"type"`
	VerificationCode string `json:"verificationCode"`
	InvitationCode string `json:"invitationCode"`
}
