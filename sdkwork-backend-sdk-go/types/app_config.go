package types


type AppConfig struct {
	OfficialAccount OfficialAccountConfig `json:"officialAccount"`
	Publish AppPublishConfig `json:"publish"`
}
