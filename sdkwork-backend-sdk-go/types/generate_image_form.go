package types

// Image generation request form
type GenerateImageForm struct {
	Prompt string `json:"prompt"`
	NegativePrompt string `json:"negativePrompt"`
	N int `json:"n"`
	Width int `json:"width"`
	Height int `json:"height"`
	Model string `json:"model"`
	ResponseFormat string `json:"responseFormat"`
	Style string `json:"style"`
	AspectRatio string `json:"aspectRatio"`
}
