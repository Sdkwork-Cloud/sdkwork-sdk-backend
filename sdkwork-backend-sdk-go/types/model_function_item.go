package types

// 模型功能配置项（包含具体媒体类型和高级功能的支持标识）
type ModelFunctionItem struct {
	Type string `json:"type"`
	Supported bool `json:"supported"`
}
