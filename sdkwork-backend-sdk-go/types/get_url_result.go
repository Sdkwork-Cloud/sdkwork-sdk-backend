package types

// URL Generation Result
type GetUrlResult struct {
	Url string `json:"url"`
	PreviewUrl string `json:"previewUrl"`
	ObjectKey string `json:"objectKey"`
}
