package types


type ChannelConfigInfo struct {
	Uuid string `json:"uuid"`
	Accounts []ModelConfig `json:"accounts"`
}
