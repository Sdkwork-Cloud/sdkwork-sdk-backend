package types

// 图片生成输入参数
type ImageGenerationInput struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Parameters map[string]interface{} `json:"parameters"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Format string `json:"format"`
	Width int `json:"width"`
	Height int `json:"height"`
	Size string `json:"size"`
	Quality string `json:"quality"`
	Style string `json:"style"`
	CfgScale float64 `json:"cfgScale"`
	Steps int `json:"steps"`
	Sampler string `json:"sampler"`
	Strength float64 `json:"strength"`
	SafetyChecker bool `json:"safetyChecker"`
	AspectRatio string `json:"aspectRatio"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
