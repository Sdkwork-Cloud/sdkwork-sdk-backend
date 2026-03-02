package types

// Organization Member VO
type PlusOrganizationMemberVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	IsActive bool `json:"isActive"`
	JoinedAt string `json:"joinedAt"`
	LeftAt string `json:"leftAt"`
	Remark string `json:"remark"`
	DepartmentIds []int `json:"departmentIds"`
	PositionIds []int `json:"positionIds"`
	RoleIds []int `json:"roleIds"`
	PrimaryDepartmentId int `json:"primaryDepartmentId"`
	PrimaryPositionId int `json:"primaryPositionId"`
	Valid bool `json:"valid"`
}
