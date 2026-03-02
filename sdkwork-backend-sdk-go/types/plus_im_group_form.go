package types

// Chat group creation form
type PlusImGroupForm struct {
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
