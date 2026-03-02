package types

// 文件存储盘信息VO
type PlusDiskVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	DiskSize int `json:"diskSize"`
	UsedSize int `json:"usedSize"`
	Description string `json:"description"`
	RemainingSize int `json:"remainingSize"`
	UsageRate float64 `json:"usageRate"`
}
