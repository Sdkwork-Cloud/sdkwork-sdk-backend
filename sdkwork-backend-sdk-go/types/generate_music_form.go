package types

// Music generation request form
type GenerateMusicForm struct {
	Prompt string `json:"prompt"`
	Lyrics string `json:"lyrics"`
	N int `json:"n"`
	Model string `json:"model"`
	Tempo int `json:"tempo"`
	Style string `json:"style"`
	Instrument string `json:"instrument"`
}
