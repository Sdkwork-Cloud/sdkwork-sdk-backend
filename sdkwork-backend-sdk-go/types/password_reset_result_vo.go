package types

// 密码重置响应视图对象
type PasswordResetResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Success bool `json:"success"`
	Message string `json:"message"`
	ExpiresIn int `json:"expiresIn"`
	Token string `json:"token"`
}
