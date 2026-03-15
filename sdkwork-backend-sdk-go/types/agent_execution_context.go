package types


type AgentExecutionContext struct {
	Id string `json:"id"`
	BizType string `json:"bizType"`
	Uuid string `json:"uuid"`
	MaxFlowSteps int `json:"maxFlowSteps"`
	FlowSteps int `json:"flowSteps"`
	Threads int `json:"threads"`
	CreateAt string `json:"createAt"`
	MaxDuration int `json:"maxDuration"`
	Listeners []ChatMessageListener `json:"listeners"`
	State string `json:"state"`
	ChatContext ChatContext `json:"chatContext"`
	ShardingContext ShardingContext `json:"shardingContext"`
	Flow Flow `json:"flow"`
	Root AgentExecutionContext `json:"root"`
	Parent AgentExecutionContext `json:"parent"`
	Pre PlusAgent `json:"pre"`
	Current PlusAgent `json:"current"`
	ResponseHandler ChatResponseHandler `json:"responseHandler"`
	Project PlusProjectObject `json:"project"`
	Disk PlusDiskObject `json:"disk"`
	DiskRootFile PlusFileObject `json:"diskRootFile"`
	Completed bool `json:"completed"`
	Running bool `json:"running"`
	Expired bool `json:"expired"`
	Waiting bool `json:"waiting"`
	Failed bool `json:"failed"`
	Paused bool `json:"paused"`
	End bool `json:"end"`
	Init bool `json:"init"`
	AgentSCOPES map[string]AgentScope `json:"agent_SCOPES"`
	OverSteps bool `json:"overSteps"`
}
