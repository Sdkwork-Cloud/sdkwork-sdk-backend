package types

// Phone verification request form
type PhoneVerificationForm struct {
	Phone string `json:"phone"`
	Code string `json:"code"`
	Type string `json:"type"`
}
