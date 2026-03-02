package types

// 邀请关系VO
type InvitationRelationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	InviterUserId int `json:"inviterUserId"`
	InviteeUserId int `json:"inviteeUserId"`
	InviteCode string `json:"inviteCode"`
	UsedTime string `json:"usedTime"`
	RelationLevel int `json:"relationLevel"`
	RewardStatus string `json:"rewardStatus"`
	RewardAmount float64 `json:"rewardAmount"`
	RewardType string `json:"rewardType"`
}
