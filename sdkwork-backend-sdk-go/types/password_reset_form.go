package types

// Password reset form
type PasswordResetForm struct {
	Token string `json:"token"`
	NewPassword string `json:"newPassword"`
}
