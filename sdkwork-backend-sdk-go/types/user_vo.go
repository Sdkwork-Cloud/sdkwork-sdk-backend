package types

// 用户信息视图对象
type UserVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Username string `json:"username"`
	Email string `json:"email"`
	Phone string `json:"phone"`
}
