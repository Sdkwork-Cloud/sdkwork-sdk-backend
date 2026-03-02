package types

// AI生成内容详情VO
type PlusAiGenerationContentVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Version int `json:"version"`
	Title string `json:"title"`
	Description string `json:"description"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Metadata map[string]interface{} `json:"metadata"`
	InputParams GenerationInputParams `json:"inputParams"`
	Output GenerationOutput `json:"output"`
	ContentFormat string `json:"contentFormat"`
	ContentUrl string `json:"contentUrl"`
	FileSize int `json:"fileSize"`
}
