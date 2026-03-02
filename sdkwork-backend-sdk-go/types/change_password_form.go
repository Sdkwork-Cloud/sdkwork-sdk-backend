package types

// 修改密码表单
type ChangePasswordForm struct {
	UserId string `json:"userId"`
	OldPassword string `json:"oldPassword"`
	NewPassword string `json:"newPassword"`
}
