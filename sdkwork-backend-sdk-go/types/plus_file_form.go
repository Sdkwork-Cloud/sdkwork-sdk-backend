package types

// File creation form
type PlusFileForm struct {
	Name string `json:"name"`
	Path string `json:"path"`
	ObjectKey string `json:"objectKey"`
	Size int `json:"size"`
	ContentType string `json:"contentType"`
	Extension string `json:"extension"`
	StorageClass string `json:"storageClass"`
	VersionId string `json:"versionId"`
	Resource FileMediaResource `json:"resource"`
	UploadTime string `json:"uploadTime"`
	LastAccessTime string `json:"lastAccessTime"`
	Description string `json:"description"`
	Tags TagsContent `json:"tags"`
	FileType string `json:"fileType"`
	FileCategory string `json:"fileCategory"`
	IsPublic bool `json:"isPublic"`
	Status string `json:"status"`
	ParentId int `json:"parentId"`
	Etag string `json:"etag"`
}
