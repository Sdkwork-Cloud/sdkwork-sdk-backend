package types

// AI generation creation form
type PlusAiGenerationForm struct {
	UserId int `json:"userId"`
	RequestId string `json:"requestId"`
	Model string `json:"model"`
	Channel string `json:"channel"`
	Type string `json:"type"`
	Cost float64 `json:"cost"`
	Status string `json:"status"`
}
