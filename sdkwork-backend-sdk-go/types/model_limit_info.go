package types

// AI模型服务令牌使用限制配置信息
type ModelLimitInfo struct {
	Unit string `json:"unit"`
	Items []ModelLimitItem `json:"items"`
}
