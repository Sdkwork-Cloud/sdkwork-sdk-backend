package types

// Dispatch rule form
type PlusOrderDispatchRuleForm struct {
	TaskCode string `json:"taskCode"`
	TaskName string `json:"taskName"`
	Enabled bool `json:"enabled"`
	AllowGrab bool `json:"allowGrab"`
	AllowAssign bool `json:"allowAssign"`
	DefaultTaskConcurrentLimit int `json:"defaultTaskConcurrentLimit"`
	Metadata OrderDispatchRuleMetadata `json:"metadata"`
}
