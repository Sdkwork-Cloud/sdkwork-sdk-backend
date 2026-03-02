package types


type ChatContext struct {
	Indent string `json:"indent"`
	ResponseHandler ChatResponseHandler `json:"responseHandler"`
	ShardingContext ShardingContext `json:"sharding_context"`
	ConversationId string `json:"conversation_id"`
	ConversationUuid string `json:"conversation_uuid"`
	UserId int `json:"user_id"`
	KnowledgeBaseId int `json:"knowledge_base_id"`
	AgentId int `json:"agent_id"`
	FlowId int `json:"flow_id"`
	DatasourceId int `json:"datasource_id"`
	ParentMessageId int `json:"parent_message_id"`
	SaveAudio bool `json:"save_audio"`
	Modalities []string `json:"modalities"`
	ChatOptions PlusChatOptions `json:"chat_options"`
	ResponseChannels []string `json:"response_channels"`
}
