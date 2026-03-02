package types


type Prompt struct {
	Contents string `json:"contents"`
	LastUserOrToolResponseMessage Message `json:"lastUserOrToolResponseMessage"`
	SystemMessages []SystemMessage `json:"systemMessages"`
	UserMessages []UserMessage `json:"userMessages"`
	UserMessage UserMessage `json:"userMessage"`
	SystemMessage SystemMessage `json:"systemMessage"`
	Options ChatOptions `json:"options"`
	Instructions []Message `json:"instructions"`
}
