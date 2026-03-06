package types

// 应用发布配置
type AppPublishConfig struct {
	Stores []AppStoreListingConfig `json:"stores"`
}
