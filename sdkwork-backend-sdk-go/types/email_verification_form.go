package types

// 邮箱验证请求表单
type EmailVerificationForm struct {
	Email string `json:"email"`
	Code string `json:"code"`
	Type string `json:"type"`
}
