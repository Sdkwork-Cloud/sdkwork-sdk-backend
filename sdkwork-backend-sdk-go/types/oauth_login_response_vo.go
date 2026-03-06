package types

// OAuth第三方登录响应
type OAuthLoginResponseVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Provider string `json:"provider"`
	AuthUrl string `json:"authUrl"`
	QrCodeUrl string `json:"qrCodeUrl"`
	QrCodeContent string `json:"qrCodeContent"`
	ExpiresIn int `json:"expiresIn"`
}
