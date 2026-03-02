package types

// 反馈信息VO
type PlusFeedbackVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Version int `json:"version"`
	UserId int `json:"userId"`
}
