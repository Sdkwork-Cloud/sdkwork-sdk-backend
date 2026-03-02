package types

// 域名创建表单
type PlusHostDomainForm struct {
	DomainName string `json:"domainName"`
	Tld string `json:"tld"`
	Registrar string `json:"registrar"`
	OwnerId int `json:"ownerId"`
	RegisteredAt string `json:"registeredAt"`
	ExpiredAt string `json:"expiredAt"`
	Status string `json:"status"`
	DnsServers DnsServers `json:"dnsServers"`
	ResolutionStatus string `json:"resolutionStatus"`
	AutoRenew bool `json:"autoRenew"`
	Remark string `json:"remark"`
}
