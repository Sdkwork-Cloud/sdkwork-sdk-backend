package types

// AI模型服务价格配置信息
type ModelPrice struct {
	Unit string `json:"unit"`
	Items []ModelPriceItem `json:"items"`
	Currency string `json:"currency"`
}
