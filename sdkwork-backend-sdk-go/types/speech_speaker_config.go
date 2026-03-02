package types


type SpeechSpeakerConfig struct {
	Speaker VoiceSpeakerInfo `json:"speaker"`
	SpeakerId int `json:"speakerId"`
	Volume float64 `json:"volume"`
	Pitch float64 `json:"pitch"`
	Language string `json:"language"`
	Speed float64 `json:"speed"`
	Format string `json:"format"`
}
