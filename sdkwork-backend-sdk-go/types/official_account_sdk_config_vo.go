package types

// 微信公众号JS-SDK配置
type OfficialAccountSdkConfigVO struct {
	Debug bool `json:"debug"`
	AppId string `json:"appId"`
	Timestamp string `json:"timestamp"`
	NonceStr string `json:"nonceStr"`
	Signature string `json:"signature"`
	JsApiList []string `json:"jsApiList"`
}
