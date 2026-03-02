package types

// App SDK配置
type AppSdkConfigVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Platform string `json:"platform"`
	OfficialAccount OfficialAccountSdkConfigVO `json:"officialAccount"`
	MiniProgram MiniProgramSdkConfigVO `json:"miniProgram"`
	App MobileAppSdkConfigVO `json:"app"`
}
