package types

// 虚拟角色生成输入参数
type CharacterGenerationInput struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Parameters map[string]interface{} `json:"parameters"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Format string `json:"format"`
	Name string `json:"name"`
	Description string `json:"description"`
	Appearance string `json:"appearance"`
	Personality string `json:"personality"`
	Background string `json:"background"`
	Type string `json:"type"`
	Style string `json:"style"`
	Pose string `json:"pose"`
	Expression string `json:"expression"`
	Gender string `json:"gender"`
	Age string `json:"age"`
	Clothing string `json:"clothing"`
	Width int `json:"width"`
	Height int `json:"height"`
	Hd bool `json:"hd"`
	MultiView bool `json:"multiView"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
