package types

// System User Value Object
type PlusUserVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	FaceImage ImageMediaResource `json:"faceImage"`
	FaceVideo ImageMediaResource `json:"faceVideo"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Gender string `json:"gender"`
	Status string `json:"status"`
	RoleIds []int `json:"roleIds"`
	RoleNames []string `json:"roleNames"`
	SocialInfoList SocialInfoList `json:"socialInfoList"`
}
