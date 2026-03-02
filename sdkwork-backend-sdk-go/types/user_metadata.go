package types


type UserMetadata struct {
	SpMchId int `json:"spMchId"`
	PartnerId int `json:"partnerId"`
	AgentId int `json:"agentId"`
	ShopId int `json:"shopId"`
	FromUserId int `json:"fromUserId"`
}
