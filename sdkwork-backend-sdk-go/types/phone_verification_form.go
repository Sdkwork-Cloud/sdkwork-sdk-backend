package types

// 手机验证请求表单
type PhoneVerificationForm struct {
	Phone string `json:"phone"`
	Code string `json:"code"`
	Type string `json:"type"`
}
