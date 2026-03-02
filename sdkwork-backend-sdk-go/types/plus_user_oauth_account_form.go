package types

// User OAuth account creation form
type PlusUserOAuthAccountForm struct {
	UserId int `json:"userId"`
	OauthProvider string `json:"oauthProvider"`
	OpenId string `json:"openId"`
	UnionId string `json:"unionId"`
	AppId string `json:"appId"`
	ChannelAccountId int `json:"channelAccountId"`
	AccessTokenExpiresAt string `json:"accessTokenExpiresAt"`
}
