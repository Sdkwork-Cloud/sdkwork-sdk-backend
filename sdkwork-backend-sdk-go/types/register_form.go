package types

// 用户注册请求表单
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
