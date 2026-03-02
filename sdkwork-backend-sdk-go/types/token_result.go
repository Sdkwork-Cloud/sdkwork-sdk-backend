package types

// 令牌结果信息
type TokenResult struct {
	Token string `json:"token"`
	ExpiresInMs string `json:"expiresInMs"`
	CreatedAt string `json:"createdAt"`
	Expired bool `json:"expired"`
}
