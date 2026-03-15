package types

// Dispatch rule view object
type PlusOrderDispatchRuleVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	TaskCode string `json:"taskCode"`
	TaskName string `json:"taskName"`
	Enabled bool `json:"enabled"`
	AllowGrab bool `json:"allowGrab"`
	AllowAssign bool `json:"allowAssign"`
	DefaultTaskConcurrentLimit int `json:"defaultTaskConcurrentLimit"`
	Metadata OrderDispatchRuleMetadata `json:"metadata"`
}
