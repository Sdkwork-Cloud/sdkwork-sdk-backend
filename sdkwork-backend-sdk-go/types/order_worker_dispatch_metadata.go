package types


type OrderWorkerDispatchMetadata struct {
	EnabledTaskCodes []string `json:"enabledTaskCodes"`
	TaskConcurrentOverrides map[string]int `json:"taskConcurrentOverrides"`
}
