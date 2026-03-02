package types

// 应用信息视图对象
type AppInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Name string `json:"name"`
	Version string `json:"version"`
	Description string `json:"description"`
	ProjectId int `json:"projectId"`
	Icon ImageMediaResource `json:"icon"`
	ResourceList AssetMediaResourceList `json:"resourceList"`
	IconUrl string `json:"iconUrl"`
	AccessUrl string `json:"accessUrl"`
	Status string `json:"status"`
	AppType string `json:"appType"`
	Platforms AppPlatforms `json:"platforms"`
	PackageName string `json:"packageName"`
	BundleId string `json:"bundleId"`
	StoreUrl string `json:"storeUrl"`
	DownloadUrl string `json:"downloadUrl"`
	BuildTime string `json:"buildTime"`
	StartTime string `json:"startTime"`
	Environment string `json:"environment"`
}
