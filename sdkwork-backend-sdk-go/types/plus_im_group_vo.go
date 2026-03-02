package types

// 聊天群组VO
type PlusImGroupVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Description string `json:"description"`
	Avatar ImageMediaResource `json:"avatar"`
	Announcement string `json:"announcement"`
	MemberCount int `json:"memberCount"`
	MaxMembers int `json:"maxMembers"`
	CreatorId int `json:"creatorId"`
	Type string `json:"type"`
	Status string `json:"status"`
	AllowMemberInvite bool `json:"allowMemberInvite"`
	RequireApproval bool `json:"requireApproval"`
}
