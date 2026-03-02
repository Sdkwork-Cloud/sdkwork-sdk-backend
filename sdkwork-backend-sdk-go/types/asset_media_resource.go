package types

// 媒体资源包装类
type AssetMediaResource struct {
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
	Image ImageMediaResource `json:"image"`
	Video VideoMediaResource `json:"video"`
	Audio AudioMediaResource `json:"audio"`
	Music MusicMediaResource `json:"music"`
	Character CharacterMediaResource `json:"character"`
	File FileMediaResource `json:"file"`
	ExtraProps map[string]interface{} `json:"extraProps"`
}
