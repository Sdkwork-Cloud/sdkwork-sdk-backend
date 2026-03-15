package types

// File creation form
type PlusFileForm struct {
	ParentId int `json:"parentId"`
	Name string `json:"name"`
	Path string `json:"path"`
	ObjectKey string `json:"objectKey"`
	Size int `json:"size"`
	ContentType string `json:"contentType"`
	StorageClass string `json:"storageClass"`
	VersionId string `json:"versionId"`
	Resource FileMediaResource `json:"resource"`
	UploadTime string `json:"uploadTime"`
	LastAccessTime string `json:"lastAccessTime"`
	Description string `json:"description"`
	Tags TagsContent `json:"tags"`
	FileType string `json:"fileType"`
	FileCategory string `json:"fileCategory"`
	Status string `json:"status"`
	Etag string `json:"etag"`
}
