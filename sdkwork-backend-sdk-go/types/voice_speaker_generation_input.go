package types

// 语音说话人生成输入参数
type VoiceSpeakerGenerationInput struct {
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
	SpeakerName string `json:"speakerName"`
	SpeakerId string `json:"speakerId"`
	Language string `json:"language"`
	Speed float64 `json:"speed"`
	Pitch float64 `json:"pitch"`
	Volume int `json:"volume"`
	Emotion string `json:"emotion"`
	SaveSpeaker bool `json:"saveSpeaker"`
	UsingExistingSpeaker bool `json:"usingExistingSpeaker"`
	VoiceClone bool `json:"voiceClone"`
	ReferenceAssetCount int `json:"referenceAssetCount"`
}
