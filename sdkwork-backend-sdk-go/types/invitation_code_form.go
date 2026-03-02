package types

// Invitation code creation form
type InvitationCodeForm struct {
	Code string `json:"code"`
	CreatorUserId int `json:"creatorUserId"`
	Status string `json:"status"`
	ExpireTime string `json:"expireTime"`
	UsageLimit int `json:"usageLimit"`
	UsedCount int `json:"usedCount"`
}
