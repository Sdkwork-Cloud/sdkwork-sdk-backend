package types

// 认证令牌信息
type LoginResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Token string `json:"token"`
	RefreshToken string `json:"refreshToken"`
	ExpiresIn int `json:"expiresIn"`
	RefreshExpiresIn int `json:"refreshExpiresIn"`
	UserId int `json:"userId"`
	User UserVO `json:"user"`
}
