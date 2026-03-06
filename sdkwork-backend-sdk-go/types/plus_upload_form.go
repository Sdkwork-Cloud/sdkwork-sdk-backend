package types

// File upload form
type PlusUploadForm struct {
	Provider string `json:"provider"`
	Name string `json:"name"`
	Scene string `json:"scene"`
	Bucket BucketObject `json:"bucket"`
	ExpirationSeconds int `json:"expirationSeconds"`
}
