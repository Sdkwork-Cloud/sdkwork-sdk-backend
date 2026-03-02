package types

// OAuth第三方登录账户配置
type OAuthAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	AuthProvider string `json:"authProvider"`
	AppId string `json:"appId"`
	AppSecret string `json:"appSecret"`
	Token string `json:"token"`
	RedirectUri string `json:"redirectUri"`
	Scope string `json:"scope"`
	IsServiceAccount bool `json:"isServiceAccount"`
	TeamId string `json:"teamId"`
	KeyId string `json:"keyId"`
	PrivateKey string `json:"privateKey"`
	PublicKey string `json:"publicKey"`
	EncodingAESKey string `json:"encodingAESKey"`
}
