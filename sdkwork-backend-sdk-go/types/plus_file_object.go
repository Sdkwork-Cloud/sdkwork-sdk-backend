package types

// 文件对象DTO
type PlusFileObject struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	DiskId int `json:"diskId"`
	Name string `json:"name"`
	Size int `json:"size"`
	Path string `json:"path"`
	RelativePath string `json:"relativePath"`
	Type string `json:"type"`
	Extension string `json:"extension"`
	LastModifiedTime string `json:"lastModifiedTime"`
	CreatedAt string `json:"createdAt"`
	VersionId string `json:"versionId"`
	Description string `json:"description"`
	ProjectUuid string `json:"projectUuid"`
	ProjectId int `json:"projectId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Author string `json:"author"`
	Prompt string `json:"prompt"`
	Content string `json:"content"`
	Tags TagsContent `json:"tags"`
	Readonly bool `json:"readonly"`
	Permission []string `json:"permission"`
	ReferenceFileId int `json:"referenceFileId"`
	Children []PlusFileObject `json:"children"`
}
