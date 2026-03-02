package types

// Image creation form
type PlusImageForm struct {
	Title string `json:"title"`
	Description string `json:"description"`
	Url string `json:"url"`
	AspectRatio string `json:"aspectRatio"`
	Width int `json:"width"`
	Height int `json:"height"`
	FileSize int `json:"fileSize"`
	Format string `json:"format"`
	Status string `json:"status"`
}
