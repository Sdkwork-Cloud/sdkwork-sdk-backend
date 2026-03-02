package types

// Audio effect generation form parameters
type GenerateAudioEffectForm struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	AudioType string `json:"audioType"`
	EffectType string `json:"effectType"`
	Intensity int `json:"intensity"`
	EffectParams string `json:"effectParams"`
	Model string `json:"model"`
	Channel string `json:"channel"`
}
