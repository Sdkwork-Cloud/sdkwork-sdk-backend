package types


type ImAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	BaseUrl string `json:"baseUrl"`
	AppId string `json:"appId"`
	AccessKey string `json:"accessKey"`
	SecretKey string `json:"secretKey"`
	SignName string `json:"signName"`
	SenderId string `json:"senderId"`
}
