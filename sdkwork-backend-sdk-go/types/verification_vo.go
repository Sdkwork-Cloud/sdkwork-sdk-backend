package types

// 验证响应视图对象
type VerificationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	Token string `json:"token"`
}
