package types

// 角色生成结果VO
type GenerateCharacterVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestId string `json:"requestId"`
	TaskId string `json:"taskId"`
	TaskStatus string `json:"taskStatus"`
	CharacterImages []ImageMediaResource `json:"characterImages"`
	CharacterId string `json:"characterId"`
	CharacterName string `json:"characterName"`
	CharacterDescription string `json:"characterDescription"`
	Model string `json:"model"`
	Duration int `json:"duration"`
	ErrorMessage string `json:"errorMessage"`
}
