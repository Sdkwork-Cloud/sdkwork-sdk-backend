package types

// 瑙掕壊鐢熸垚琛ㄥ崟锛岀敤浜庝紶閫掕鑹茬敓鎴愮殑涓氬姟鍙傛暟
type GenerateCharacterForm struct {
	Name string `json:"name"`
	Description string `json:"description"`
	Appearance string `json:"appearance"`
	Personality string `json:"personality"`
	Background string `json:"background"`
	Style string `json:"style"`
	ResponseFormat string `json:"responseFormat"`
	Model string `json:"model"`
	N int `json:"n"`
	Width int `json:"width"`
	Height int `json:"height"`
	Quality string `json:"quality"`
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
}
