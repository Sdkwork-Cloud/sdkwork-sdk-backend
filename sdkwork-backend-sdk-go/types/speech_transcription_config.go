package types


type SpeechTranscriptionConfig struct {
	Channel string `json:"channel"`
	Product string `json:"product"`
	Options AudioTranscriptionOptions `json:"options"`
}
