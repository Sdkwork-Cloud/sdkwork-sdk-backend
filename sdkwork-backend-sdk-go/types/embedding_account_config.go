package types


type EmbeddingAccountConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Region string `json:"region"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Functions []string `json:"functions"`
	Metadata AccountConfigMetadata `json:"metadata"`
	Properties map[string]interface{} `json:"properties"`
	ApiKey string `json:"apiKey"`
	BaseUrl string `json:"baseUrl"`
	DefaultModel string `json:"defaultModel"`
	Dimension int `json:"dimension"`
	Options PlusChatOptions `json:"options"`
}
