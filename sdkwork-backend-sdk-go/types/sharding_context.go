package types


type ShardingContext struct {
	Platform string `json:"platform"`
	Owner string `json:"owner"`
	ShardingKey string `json:"shardingKey"`
	TenantId int `json:"tenant_id"`
	OrganizationId int `json:"organization_id"`
	UserId int `json:"user_id"`
}
