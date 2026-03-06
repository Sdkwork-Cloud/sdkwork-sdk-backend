package types

// AI model list query form
type PlusAiModelInfoQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	Keyword string `json:"keyword"`
	Channel string `json:"channel"`
	ModelType string `json:"modelType"`
	Status string `json:"status"`
	Family string `json:"family"`
	OpenSource bool `json:"openSource"`
}
