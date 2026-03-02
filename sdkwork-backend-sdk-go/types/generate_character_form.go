package types

// 角色生成表单，用于传递角色生成的业务参数
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
