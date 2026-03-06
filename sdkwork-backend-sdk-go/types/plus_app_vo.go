package types

// Application Value Object
type PlusAppVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
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
	InstallPlatforms AppPlatforms `json:"installPlatforms"`
	InstallSkill AppInstallSkill `json:"installSkill"`
	InstallConfig AppInstallConfig `json:"installConfig"`
	PackageName string `json:"packageName"`
	BundleId string `json:"bundleId"`
	StoreUrl string `json:"storeUrl"`
	DownloadUrl string `json:"downloadUrl"`
}
