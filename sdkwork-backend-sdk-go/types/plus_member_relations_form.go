package types

// Member relation creation form
type PlusMemberRelationsForm struct {
	MemberId int `json:"memberId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Type string `json:"type"`
	TargetId int `json:"targetId"`
	IsPrimary bool `json:"isPrimary"`
	IsActive bool `json:"isActive"`
	EffectiveAt string `json:"effectiveAt"`
	ExpiredAt string `json:"expiredAt"`
	SortOrder int `json:"sortOrder"`
	Remark string `json:"remark"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
}
