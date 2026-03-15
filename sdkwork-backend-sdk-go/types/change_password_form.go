package types

// Change password form
type ChangePasswordForm struct {
	UserId string `json:"userId"`
	OldPassword string `json:"oldPassword"`
	NewPassword string `json:"newPassword"`
}
