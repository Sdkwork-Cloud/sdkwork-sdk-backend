package types

// 音乐生成输入参数
type MusicGenerationInput struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Parameters map[string]interface{} `json:"parameters"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Format string `json:"format"`
	Lyrics string `json:"lyrics"`
	Duration int `json:"duration"`
	Genre string `json:"genre"`
	Style string `json:"style"`
	Tempo int `json:"tempo"`
	Key string `json:"key"`
	TimeSignature string `json:"timeSignature"`
	Mood string `json:"mood"`
	Instruments string `json:"instruments"`
	Instrumental bool `json:"instrumental"`
	Hd bool `json:"hd"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
