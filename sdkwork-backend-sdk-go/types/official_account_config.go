package types


type OfficialAccountConfig struct {
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
	Secret string `json:"secret"`
	AesKey string `json:"aesKey"`
	QrCodeUrl string `json:"qrCodeUrl"`
	OriginalId string `json:"originalId"`
	NotifyUrl string `json:"notifyUrl"`
	SecurityModeEnabled bool `json:"securityModeEnabled"`
	AccessToken string `json:"accessToken"`
	AccessTokenExpiresIn int `json:"accessTokenExpiresIn"`
	AccessTokenFetchTime int `json:"accessTokenFetchTime"`
	JsSdkEnabled bool `json:"jsSdkEnabled"`
	JsApiDomain string `json:"jsApiDomain"`
	EncodingAESKey string `json:"encodingAESKey"`
}
