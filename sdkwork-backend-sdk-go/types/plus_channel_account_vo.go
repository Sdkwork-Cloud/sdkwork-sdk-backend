package types

// 渠道账户VO，用于展示第三方渠道连接账户信息，如微信公众号、钉钉机器人等
type PlusChannelAccountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Name string `json:"name"`
	Channel string `json:"channel"`
	Configs ChannelConfigInfo `json:"configs"`
	Status string `json:"status"`
	Description string `json:"description"`
}
