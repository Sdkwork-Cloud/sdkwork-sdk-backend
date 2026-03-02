package types

// 音频生成输入参数(语音合成TTS)
type AudioGenerationInput struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	ReferenceAssets []AssetMediaResource `json:"referenceAssets"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Parameters map[string]interface{} `json:"parameters"`
	N int `json:"n"`
	Seed int `json:"seed"`
	Format string `json:"format"`
	Text string `json:"text"`
	Voice string `json:"voice"`
	VoiceSpeakerId int `json:"voiceSpeakerId"`
	Language string `json:"language"`
	Speed float64 `json:"speed"`
	Pitch float64 `json:"pitch"`
	Volume int `json:"volume"`
	SampleRate int `json:"sampleRate"`
	BitRate int `json:"bitRate"`
	Channels int `json:"channels"`
	Emotion string `json:"emotion"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
