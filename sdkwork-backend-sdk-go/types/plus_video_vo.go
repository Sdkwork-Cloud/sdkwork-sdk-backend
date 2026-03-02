package types

// 视频信息VO
type PlusVideoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Version int `json:"version"`
	Title string `json:"title"`
	Description string `json:"description"`
	Resource VideoMediaResource `json:"resource"`
	Author AuthorInfo `json:"author"`
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
