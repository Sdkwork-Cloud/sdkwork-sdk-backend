package types

// 图片信息VO
type PlusImageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Description string `json:"description"`
	Resource ImageMediaResource `json:"resource"`
	Author AuthorInfo `json:"author"`
	Url string `json:"url"`
	AspectRatio string `json:"aspectRatio"`
	Width int `json:"width"`
	Height int `json:"height"`
	FileSize int `json:"fileSize"`
	Format string `json:"format"`
	Status string `json:"status"`
}
