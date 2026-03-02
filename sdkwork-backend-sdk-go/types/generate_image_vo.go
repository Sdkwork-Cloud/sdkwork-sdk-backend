package types

// Image generation result value object
type GenerateImageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestId string `json:"requestId"`
	TaskId string `json:"taskId"`
	TaskStatus string `json:"taskStatus"`
	Images ImageMediaResourceList `json:"images"`
}
