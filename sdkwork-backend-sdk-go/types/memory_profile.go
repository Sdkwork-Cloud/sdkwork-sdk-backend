package types

// AI模型服务令牌使用限制配置信息
type MemoryProfile struct {
	Items []ProfileItem `json:"items"`
	Customs map[string][]ProfileItem `json:"customs"`
	Description string `json:"description"`
}
