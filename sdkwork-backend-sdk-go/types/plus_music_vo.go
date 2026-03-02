package types

// 音乐信息VO
type PlusMusicVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Version int `json:"version"`
	Title string `json:"title"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	Description string `json:"description"`
	Resource MusicMediaResource `json:"resource"`
	Author AuthorInfo `json:"author"`
	ContentUrl string `json:"contentUrl"`
	ResourceList AssetMediaResourceList `json:"resourceList"`
	Format string `json:"format"`
	Duration int `json:"duration"`
	FileSize int `json:"fileSize"`
	ThumbnailUrl string `json:"thumbnailUrl"`
	Artist string `json:"artist"`
	Genre string `json:"genre"`
	Bitrate int `json:"bitrate"`
	Status string `json:"status"`
}
