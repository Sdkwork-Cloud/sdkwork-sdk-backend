package types

// Music generation result value object
type GenerateMusicVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	RequestId string `json:"requestId"`
	TaskId string `json:"taskId"`
	TaskStatus string `json:"taskStatus"`
	Audios AudioMediaResourceList `json:"audios"`
	Lyrics string `json:"lyrics"`
}
