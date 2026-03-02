package types

// Application creation form
type PlusAppForm struct {
	Name string `json:"name"`
	Icon ImageMediaResource `json:"icon"`
	ResourceList AssetMediaResourceList `json:"resourceList"`
	ProjectId int `json:"projectId"`
	Description string `json:"description"`
	Version string `json:"version"`
	IconUrl string `json:"iconUrl"`
	AccessUrl string `json:"accessUrl"`
	Config AppConfig `json:"config"`
	Status string `json:"status"`
	AppType string `json:"appType"`
	Platforms AppPlatforms `json:"platforms"`
	PackageName string `json:"packageName"`
	BundleId string `json:"bundleId"`
	StoreUrl string `json:"storeUrl"`
	DownloadUrl string `json:"downloadUrl"`
}
