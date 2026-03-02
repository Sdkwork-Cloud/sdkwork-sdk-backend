package types

// 模型定价具体条目（包含价格类型和对应价格数值）
type ModelPriceItem struct {
	Type string `json:"type"`
	Price float64 `json:"price"`
}
