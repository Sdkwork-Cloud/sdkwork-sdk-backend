package types

// 密码重置表单
type PasswordResetForm struct {
	Token string `json:"token"`
	NewPassword string `json:"newPassword"`
}
