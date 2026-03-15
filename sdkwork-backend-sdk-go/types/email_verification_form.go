package types

// 閭楠岃瘉璇锋眰琛ㄥ崟
type EmailVerificationForm struct {
	Email string `json:"email"`
	Code string `json:"code"`
	Type string `json:"type"`
}
