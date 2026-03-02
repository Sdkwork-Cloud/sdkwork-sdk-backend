package types

// Member Relations VO
type PlusMemberRelationsVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	MemberId int `json:"memberId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Type string `json:"type"`
	ParentId int `json:"parentId"`
	TargetId int `json:"targetId"`
	IsPrimary bool `json:"isPrimary"`
	IsActive bool `json:"isActive"`
	EffectiveAt string `json:"effectiveAt"`
	ExpiredAt string `json:"expiredAt"`
	SortOrder int `json:"sortOrder"`
	Remark string `json:"remark"`
}
