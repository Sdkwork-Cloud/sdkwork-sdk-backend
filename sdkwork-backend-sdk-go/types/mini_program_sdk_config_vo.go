package types

// 微信小程序SDK配置
type MiniProgramSdkConfigVO struct {
	AppId string `json:"appId"`
	Timestamp int `json:"timestamp"`
	NonceStr string `json:"nonceStr"`
	Signature string `json:"signature"`
	JsApiList []string `json:"jsApiList"`
}
