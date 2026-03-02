package types

// Sharding key creation form
type PlusShardingKeyForm struct {
	ShardingKey string `json:"shardingKey"`
	TenantId int `json:"tenantId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Status string `json:"status"`
	Description string `json:"description"`
}
