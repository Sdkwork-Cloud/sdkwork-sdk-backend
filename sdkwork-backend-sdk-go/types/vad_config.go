package types


type VadConfig struct {
	SpeechThreshold float64 `json:"speechThreshold"`
	MinSpeechDurationMs int `json:"minSpeechDurationMs"`
	MinSilenceDurationMs int `json:"minSilenceDurationMs"`
	MaxSilenceDurationMs int `json:"maxSilenceDurationMs"`
	SilenceTimeout int `json:"silenceTimeout"`
	SpeechTimeout int `json:"speechTimeout"`
	WindowSize int `json:"windowSize"`
	StepSize int `json:"stepSize"`
}
