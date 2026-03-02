package types


type AecConfig struct {
	EchoMode int `json:"echoMode"`
	DelayEstimation int `json:"delayEstimation"`
	NoiseSuppression int `json:"noiseSuppression"`
	EchoTailMs int `json:"echoTailMs"`
	SampleRate int `json:"sampleRate"`
}
