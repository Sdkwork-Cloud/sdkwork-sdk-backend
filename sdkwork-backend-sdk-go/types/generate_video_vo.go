package types

// Video generation result value object
type GenerateVideoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestId string `json:"requestId"`
	TaskId string `json:"taskId"`
	TaskStatus string `json:"taskStatus"`
	Videos VideoMediaResourceList `json:"videos"`
	Status string `json:"status"`
}
