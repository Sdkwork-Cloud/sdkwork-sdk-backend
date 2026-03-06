package types

// 应用安装包定义
type AppInstallPackage struct {
	Id string `json:"id"`
	Name string `json:"name"`
	SourceType string `json:"sourceType"`
	PackageFormat string `json:"packageFormat"`
	Platform string `json:"platform"`
	Url string `json:"url"`
	RepositoryUrl string `json:"repositoryUrl"`
	Branch string `json:"branch"`
	Tag string `json:"tag"`
	CommitId string `json:"commitId"`
	ChecksumAlgorithm string `json:"checksumAlgorithm"`
	Checksum string `json:"checksum"`
	Architecture string `json:"architecture"`
	SizeBytes int `json:"sizeBytes"`
	Enabled bool `json:"enabled"`
}
