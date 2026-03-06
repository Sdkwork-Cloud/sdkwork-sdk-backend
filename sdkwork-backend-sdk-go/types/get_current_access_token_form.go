package types

// 获取当前租户/组织访问令牌请求
type GetCurrentAccessTokenForm struct {
	AppId int `json:"appId"`
	Platform string `json:"platform"`
}
