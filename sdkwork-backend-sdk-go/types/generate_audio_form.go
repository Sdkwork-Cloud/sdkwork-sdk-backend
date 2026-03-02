package types

// Audio Generation Form
type GenerateAudioForm struct {
	Title string `json:"title"`
	Prompt string `json:"prompt"`
	Voice string `json:"voice"`
	Model string `json:"model"`
	Format string `json:"format"`
	Speed float64 `json:"speed"`
}
