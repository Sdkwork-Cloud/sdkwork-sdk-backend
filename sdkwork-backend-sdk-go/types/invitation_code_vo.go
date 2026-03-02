package types

// 邀请码VO对象
type InvitationCodeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Code string `json:"code"`
	CreatorUserId int `json:"creatorUserId"`
	Status string `json:"status"`
	ExpireTime string `json:"expireTime"`
	UsageLimit int `json:"usageLimit"`
	UsedCount int `json:"usedCount"`
}
