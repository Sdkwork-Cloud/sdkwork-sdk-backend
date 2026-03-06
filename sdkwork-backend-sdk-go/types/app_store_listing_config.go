package types

// 应用商店发布配置
type AppStoreListingConfig struct {
	Platform string `json:"platform"`
	StoreAppId string `json:"storeAppId"`
	PackageName string `json:"packageName"`
	BundleId string `json:"bundleId"`
	ReleaseTrack string `json:"releaseTrack"`
	PrivacyPolicyUrl string `json:"privacyPolicyUrl"`
	TermsOfServiceUrl string `json:"termsOfServiceUrl"`
	SupportUrl string `json:"supportUrl"`
	SupportEmail string `json:"supportEmail"`
	MarketingUrl string `json:"marketingUrl"`
	Category string `json:"category"`
	Subcategory string `json:"subcategory"`
	ContentRating string `json:"contentRating"`
	Languages []string `json:"languages"`
	Countries []string `json:"countries"`
	ScreenshotUrls []string `json:"screenshotUrls"`
}
