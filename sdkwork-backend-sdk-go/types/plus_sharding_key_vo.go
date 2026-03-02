package types

// 分片键值对象
type PlusShardingKeyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ShardingKey string `json:"shardingKey"`
	TenantId int `json:"tenantId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Status string `json:"status"`
	Description string `json:"description"`
}
