package types

// 音效生成输入参数
type AudioEffectGenerationInput struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Parameters map[string]interface{} `json:"parameters"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Format string `json:"format"`
	Description string `json:"description"`
	Category string `json:"category"`
	Duration int `json:"duration"`
	SampleRate int `json:"sampleRate"`
	BitRate int `json:"bitRate"`
	Channels int `json:"channels"`
	Loop bool `json:"loop"`
	FadeIn float64 `json:"fadeIn"`
	FadeOut float64 `json:"fadeOut"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
