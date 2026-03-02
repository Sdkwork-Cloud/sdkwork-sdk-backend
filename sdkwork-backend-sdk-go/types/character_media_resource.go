package types

// 数字人媒体资源
type CharacterMediaResource struct {
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
	CharacterType string `json:"characterType"`
	Gender string `json:"gender"`
	AgeGroup string `json:"ageGroup"`
	AvatarUrl string `json:"avatarUrl"`
	AvatarVideoUrl string `json:"avatarVideoUrl"`
	SpeakerId int `json:"speakerId"`
	AppearanceParams map[string]interface{} `json:"appearanceParams"`
	AnimationParams map[string]interface{} `json:"animationParams"`
}
