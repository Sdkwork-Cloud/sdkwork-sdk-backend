package types

// 鍙戦€侀獙璇佺爜璇锋眰琛ㄥ崟
type SendVerificationCodeForm struct {
	Identifier string `json:"identifier"`
	Method string `json:"method"`
	Type string `json:"type"`
}
