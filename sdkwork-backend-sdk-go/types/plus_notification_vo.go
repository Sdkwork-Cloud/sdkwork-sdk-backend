package types

// Notification VO
type PlusNotificationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Role string `json:"role"`
	SenderId int `json:"senderId"`
	Sender Participant `json:"sender"`
	ReceiverId int `json:"receiverId"`
	Receiver Participant `json:"receiver"`
	GroupId int `json:"groupId"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	ChannelType string `json:"channelType"`
	TemplateId string `json:"templateId"`
	TemplateParams map[string]interface{} `json:"templateParams"`
	RedirectUrl string `json:"redirectUrl"`
	MiniProgramPath string `json:"miniProgramPath"`
	Status string `json:"status"`
	SentAt string `json:"sentAt"`
	ReadAt string `json:"readAt"`
	ExtraData map[string]interface{} `json:"extraData"`
	RetryCount int `json:"retryCount"`
	MaxRetryCount int `json:"maxRetryCount"`
	ErrorMessage string `json:"errorMessage"`
}
