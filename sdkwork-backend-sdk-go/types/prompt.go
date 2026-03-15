package types


type Prompt struct {
	Contents string `json:"contents"`
	Options ChatOptions `json:"options"`
	Instructions []Message `json:"instructions"`
	LastUserOrToolResponseMessage Message `json:"lastUserOrToolResponseMessage"`
	UserMessages []UserMessage `json:"userMessages"`
	UserMessage UserMessage `json:"userMessage"`
	SystemMessages []SystemMessage `json:"systemMessages"`
	SystemMessage SystemMessage `json:"systemMessage"`
}
