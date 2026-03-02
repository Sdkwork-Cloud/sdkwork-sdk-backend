package types


type SpeechConfig struct {
	SpeakerConfig SpeechSpeakerConfig `json:"speakerConfig"`
	TranscriptionConfig SpeechTranscriptionConfig `json:"transcriptionConfig"`
	VadConfig VadConfig `json:"vadConfig"`
	AecConfig AecConfig `json:"aecConfig"`
}
