package types

// Prompt creation form
type PlusAiPromptForm struct {
	Title string `json:"title"`
	Content string `json:"content"`
	Description string `json:"description"`
	CategoryId int `json:"categoryId"`
	Enabled bool `json:"enabled"`
	Sort int `json:"sort"`
	Parameters map[string]interface{} `json:"parameters"`
	Creator string `json:"creator"`
	Model string `json:"model"`
	Tags TagsContent `json:"tags"`
	UsageCount int `json:"usageCount"`
	AvgResponseTime int `json:"avgResponseTime"`
}
