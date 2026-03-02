package types

// AI生成任务输出结果
type GenerationOutput struct {
	Resources []AssetMediaResource `json:"resources"`
	PrimaryUrl string `json:"primaryUrl"`
	Urls []string `json:"urls"`
	DurationMs int `json:"durationMs"`
	TokenUsage int `json:"tokenUsage"`
	Cost float64 `json:"cost"`
	ModelVersion string `json:"modelVersion"`
	Seed int `json:"seed"`
	Metadata map[string]interface{} `json:"metadata"`
	CreatedAt string `json:"createdAt"`
	ResourceCount int `json:"resourceCount"`
	PrimaryResource AssetMediaResource `json:"primaryResource"`
}
