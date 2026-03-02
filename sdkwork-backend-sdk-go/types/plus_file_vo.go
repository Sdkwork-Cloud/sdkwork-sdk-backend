package types

// 文件VO类，用于存储文件的元数据信息
type PlusFileVO struct {
	ParentUuid string `json:"parentUuid"`
	ParentMetadata PlusTreeParentMetadata `json:"parentMetadata"`
	Id int `json:"id"`
	ParentId int `json:"parentId"`
	Name string `json:"name"`
	Path string `json:"path"`
	FullPath string `json:"fullPath"`
	ObjectKey string `json:"objectKey"`
	Size int `json:"size"`
	ContentType string `json:"contentType"`
	Extension string `json:"extension"`
	StorageClass string `json:"storageClass"`
	VersionId string `json:"versionId"`
	Resource FileMediaResource `json:"resource"`
	Url string `json:"url"`
	UploadTime string `json:"uploadTime"`
	LastAccessTime string `json:"lastAccessTime"`
	Description string `json:"description"`
	Tags TagsContent `json:"tags"`
	FileType string `json:"fileType"`
	FileCategory string `json:"fileCategory"`
	Permission FilePermission `json:"permission"`
	IsPublic bool `json:"isPublic"`
	PinnedAt string `json:"pinnedAt"`
	Status string `json:"status"`
	Content FileContentObject `json:"content"`
	Etag string `json:"etag"`
}
