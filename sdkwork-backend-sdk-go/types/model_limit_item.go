package types

// 模型服务限制配置项（包含限制类型和具体数值）
type ModelLimitItem struct {
	Type string `json:"type"`
	Value float64 `json:"value"`
}
