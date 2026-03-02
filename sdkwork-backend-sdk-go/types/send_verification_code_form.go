package types

// 发送验证码请求表单
type SendVerificationCodeForm struct {
	Identifier string `json:"identifier"`
	Method string `json:"method"`
	Type string `json:"type"`
}
