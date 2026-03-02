package types

// Organization member creation form
type PlusOrganizationMemberForm struct {
	UserId int `json:"userId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	IsActive bool `json:"isActive"`
	JoinedAt string `json:"joinedAt"`
	LeftAt string `json:"leftAt"`
	Remark string `json:"remark"`
}
