package types

// Voice Speaker Generation Form
type GenerateVoiceSpeakerForm struct {
	VoiceSpeakerName string `json:"voiceSpeakerName"`
	VoiceType string `json:"voiceType"`
	Text string `json:"text"`
	Speed float64 `json:"speed"`
	Pitch float64 `json:"pitch"`
	Volume int `json:"volume"`
	Model string `json:"model"`
	ResponseFormat string `json:"responseFormat"`
	Prompt string `json:"prompt"`
}
