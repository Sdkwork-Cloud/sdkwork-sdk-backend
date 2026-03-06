package types

// 应用安装配置
type AppInstallConfig struct {
	Packages []AppInstallPackage `json:"packages"`
	DefaultPackageId string `json:"defaultPackageId"`
	InstallCommand string `json:"installCommand"`
	LaunchCommand string `json:"launchCommand"`
	UninstallCommand string `json:"uninstallCommand"`
	Metadata map[string]interface{} `json:"metadata"`
}
