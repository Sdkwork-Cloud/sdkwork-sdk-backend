package types

// AI生成任务输入参数基类
type BaseGenerationInput struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Parameters map[string]interface{} `json:"parameters"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Format string `json:"format"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
