package types

// Invitation relation creation form
type InvitationRelationForm struct {
	InviterUserId int `json:"inviterUserId"`
	InviteeUserId int `json:"inviteeUserId"`
	InviteCode string `json:"inviteCode"`
	UsedTime string `json:"usedTime"`
	RelationLevel int `json:"relationLevel"`
	RewardStatus string `json:"rewardStatus"`
	RewardAmount float64 `json:"rewardAmount"`
	RewardType string `json:"rewardType"`
}
