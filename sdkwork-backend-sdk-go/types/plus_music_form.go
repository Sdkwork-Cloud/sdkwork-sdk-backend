package types

// Music creation form
type PlusMusicForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	ContentUrl string `json:"contentUrl"`
	Format string `json:"format"`
	Duration int `json:"duration"`
	FileSize int `json:"fileSize"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	Artist string `json:"artist"`
	Genre string `json:"genre"`
	Bitrate int `json:"bitrate"`
	Status string `json:"status"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
}
