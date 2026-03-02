package types


type WechatInfo struct {
	OpenId string `json:"openId"`
	UnionId string `json:"unionId"`
	Nickname string `json:"nickname"`
	AvatarUrl string `json:"avatarUrl"`
	Gender int `json:"gender"`
	Country string `json:"country"`
	Province string `json:"province"`
	City string `json:"city"`
}
