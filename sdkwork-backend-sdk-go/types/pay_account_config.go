package types


type PayAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	MerchantId string `json:"merchantId"`
	AppId string `json:"appId"`
	PrivateKey string `json:"privateKey"`
	PublicKey string `json:"publicKey"`
	SecretKey string `json:"secretKey"`
	NotifyUrl string `json:"notifyUrl"`
	ReturnUrl string `json:"returnUrl"`
	GatewayUrl string `json:"gatewayUrl"`
	PayType string `json:"payType"`
}
