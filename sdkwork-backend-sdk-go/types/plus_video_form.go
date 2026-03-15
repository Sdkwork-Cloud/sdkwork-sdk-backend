package types

// Video creation form
type PlusVideoForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	ContentUrl string `json:"contentUrl"`
	AspectRatio string `json:"aspectRatio"`
	Duration int `json:"duration"`
	Resolution string `json:"resolution"`
	Width int `json:"width"`
	Height int `json:"height"`
	FileSize int `json:"fileSize"`
	Format string `json:"format"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	Status string `json:"status"`
}
