package types

// 系统角色VO类
type PlusRoleVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Code string `json:"code"`
	Name string `json:"name"`
	Description string `json:"description"`
	Status string `json:"status"`
}
