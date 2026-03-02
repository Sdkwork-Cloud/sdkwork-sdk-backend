package types

// 移动应用SDK配置
type MobileAppSdkConfigVO struct {
	PackageName string `json:"packageName"`
	Version string `json:"version"`
	AppKey string `json:"appKey"`
	PushToken string `json:"pushToken"`
}
