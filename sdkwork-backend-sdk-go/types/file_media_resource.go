package types

// 文件媒体资源
type FileMediaResource struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Url string `json:"url"`
	Bytes string `json:"bytes"`
	LocalFile interface{} `json:"localFile"`
	Base64 string `json:"base64"`
	Type string `json:"type"`
	Size int `json:"size"`
	Name string `json:"name"`
	Extension string `json:"extension"`
	Tags TagsContent `json:"tags"`
	Metadata map[string]interface{} `json:"metadata"`
	Prompt string `json:"prompt"`
	Width int `json:"width"`
	Height int `json:"height"`
	Duration int `json:"duration"`
	MimeType string `json:"mime_type"`
}
