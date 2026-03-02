package types

// 视频生成输入参数
type VideoGenerationInput struct {
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
	Duration int `json:"duration"`
	Fps int `json:"fps"`
	Style string `json:"style"`
	AspectRatio string `json:"aspectRatio"`
	MotionStrength int `json:"motionStrength"`
	CameraMotion string `json:"cameraMotion"`
	Loop bool `json:"loop"`
	Hd bool `json:"hd"`
	Subtitle bool `json:"subtitle"`
	TextToVideo bool `json:"textToVideo"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
