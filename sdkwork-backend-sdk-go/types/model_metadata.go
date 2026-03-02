package types

// 模型附加技术特性信息（包含多模态支持、生成能力等）
type ModelMetadata struct {
	Durations []int `json:"durations"`
	Resolutions []string `json:"resolutions"`
	Ratios []AspectRatio `json:"ratios"`
	IsMultimodal bool `json:"is_multimodal"`
	IsReasoning bool `json:"is_reasoning"`
	IsToolCall bool `json:"is_tool_call"`
}
