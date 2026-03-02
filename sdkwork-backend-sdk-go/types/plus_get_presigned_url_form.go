package types

// Presigned URL request form
type PlusGetPresignedUrlForm struct {
	Provider string `json:"provider"`
	Name string `json:"name"`
	Scene string `json:"scene"`
	Bucket BucketObject `json:"bucket"`
	Method string `json:"method"`
	ExpirationSeconds int `json:"expirationSeconds"`
}
