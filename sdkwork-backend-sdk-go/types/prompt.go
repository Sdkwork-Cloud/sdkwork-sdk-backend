package types


type Prompt struct {
	Contents string `json:"contents"`
	Options ChatOptions `json:"options"`
	Instructions []Message `json:"instructions"`
	LastUserOrToolResponseMessage Message `json:"lastUserOrToolResponseMessage"`
	SystemMessages []SystemMessage `json:"systemMessages"`
	UserMessages []UserMessage `json:"userMessages"`
	UserMessage UserMessage `json:"userMessage"`
	SystemMessage SystemMessage `json:"systemMessage"`
}
