package types

// User creation form
type PlusUserForm struct {
	Username string `json:"username"`
	Password string `json:"password"`
	Salt string `json:"salt"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Status string `json:"status"`
	RoleIds []int `json:"roleIds"`
}
