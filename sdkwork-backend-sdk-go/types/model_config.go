package types


type ModelConfig struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Weight int `json:"weight"`
	Channel string `json:"channel"`
	Product string `json:"product"`
	Agent AgentAccountConfig `json:"agent"`
	AppStore AppStoreAccountConfig `json:"appStore"`
	Apikey ApiKeyAccountConfig `json:"apikey"`
	Audio AudioAccountConfig `json:"audio"`
	Cloud CloudAccountConfig `json:"cloud"`
	Datasource DatasourceAccountConfig `json:"datasource"`
	Embedding EmbeddingAccountConfig `json:"embedding"`
	Files FilesAccountConfig `json:"files"`
	Im ImAccountConfig `json:"im"`
	Image ImageAccountConfig `json:"image"`
	Iot IotAccountConfig `json:"iot"`
	Knowledge KnowledgeAccountConfig `json:"knowledge"`
	Llm LlmAccountConfig `json:"llm"`
	Memory MemoryAccountConfig `json:"memory"`
	Moderation ModerationAccountConfig `json:"moderation"`
	Music MusicAccountConfig `json:"music"`
	MiniProgram MiniProgramAccountConfig `json:"miniProgram"`
	News NewsAccountConfig `json:"news"`
	Ocr OcrAccountConfig `json:"ocr"`
	Official OfficialAccountConfig `json:"official"`
	Oss OssAccountConfig `json:"oss"`
	Pay PayAccountConfig `json:"pay"`
	Rtc RtcAccountConfig `json:"rtc"`
	Search SearchAccountConfig `json:"search"`
	Sms SmsAccountConfig `json:"sms"`
	Tool ToolAccountConfig `json:"tool"`
	Vector VectorAccountConfig `json:"vector"`
	Video VideoAccountConfig `json:"video"`
	Voice AudioAccountConfig `json:"voice"`
	Resources ChannelResourceInfo `json:"resources"`
	Properties map[string]interface{} `json:"properties"`
	Oauth OAuthAccountConfig `json:"oauth"`
}
