package types

// AI generation creation form
type PlusAiGenerationForm struct {
	UserId int `json:"userId"`
	RequestId string `json:"requestId"`
	Model string `json:"model"`
	Channel string `json:"channel"`
	Type string `json:"type"`
	CoverImages ImageMediaResourceList `json:"coverImages"`
	ResourceList AssetMediaResourceList `json:"resourceList"`
	Storyboard VideoStoryboard `json:"storyboard"`
	Author AuthorInfo `json:"author"`
	Tags TagsContent `json:"tags"`
	PromptId int `json:"promptId"`
	ChannelTaskId string `json:"channelTaskId"`
	ChannelTaskStatus string `json:"channelTaskStatus"`
	TaskCreatedTime string `json:"taskCreatedTime"`
	TaskUpdatedTime string `json:"taskUpdatedTime"`
	Cost float64 `json:"cost"`
	Status string `json:"status"`
	RequestTime string `json:"requestTime"`
	ResponseTime string `json:"responseTime"`
	UsageRecordId int `json:"usageRecordId"`
	ConversationId int `json:"conversationId"`
	MessageId int `json:"messageId"`
}
