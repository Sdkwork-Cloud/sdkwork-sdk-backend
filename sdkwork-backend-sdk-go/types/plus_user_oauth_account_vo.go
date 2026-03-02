package types

// 用户OAuth账户值对象
type PlusUserOAuthAccountVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	OauthProvider string `json:"oauthProvider"`
	OpenId string `json:"openId"`
	UnionId string `json:"unionId"`
	AppId string `json:"appId"`
	ChannelAccountId int `json:"channelAccountId"`
	AccessTokenExpiresAt string `json:"accessTokenExpiresAt"`
}
