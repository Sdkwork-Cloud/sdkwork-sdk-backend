package types


type MiniProgramAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	AppId string `json:"appId"`
	Secret string `json:"secret"`
	BaseUrl string `json:"baseUrl"`
	AccessKey string `json:"accessKey"`
	SecretKey string `json:"secretKey"`
	DefaultModel string `json:"defaultModel"`
}
