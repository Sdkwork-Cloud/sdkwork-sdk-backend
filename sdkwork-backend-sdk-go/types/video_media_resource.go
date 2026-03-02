package types

// 视频媒体资源
type VideoMediaResource struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Url string `json:"url"`
	Bytes string `json:"bytes"`
	LocalFile interface{} `json:"localFile"`
	Base64 string `json:"base64"`
	Type string `json:"type"`
	MimeType string `json:"mimeType"`
	Size int `json:"size"`
	Name string `json:"name"`
	Extension string `json:"extension"`
	Tags TagsContent `json:"tags"`
	Metadata map[string]interface{} `json:"metadata"`
	Prompt string `json:"prompt"`
	Duration int `json:"duration"`
	Width int `json:"width"`
	Height int `json:"height"`
}
