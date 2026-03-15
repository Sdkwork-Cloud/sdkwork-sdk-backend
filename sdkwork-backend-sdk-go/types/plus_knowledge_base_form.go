package types

// Knowledge base creation form
type PlusKnowledgeBaseForm struct {
	Name string `json:"name"`
	DiskId int `json:"diskId"`
	Channel string `json:"channel"`
	ChannelId string `json:"channelId"`
	ProjectId int `json:"projectId"`
	Description string `json:"description"`
}
