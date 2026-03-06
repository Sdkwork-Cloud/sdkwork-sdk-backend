package types

// 租户审计日志值对象
type PlusTenantAuditLogVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	TenantId int `json:"tenantId"`
	Action string `json:"action"`
	Module string `json:"module"`
	Operator string `json:"operator"`
	Description string `json:"description"`
	Result string `json:"result"`
	CreateTime string `json:"createTime"`
	Ip string `json:"ip"`
}
