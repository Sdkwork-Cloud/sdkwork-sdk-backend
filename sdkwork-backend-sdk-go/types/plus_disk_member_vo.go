package types

// 磁盘成员VO，封装磁盘成员的核心信息
type PlusDiskMemberVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	V int `json:"v"`
	DiskId int `json:"diskId"`
	UserId int `json:"userId"`
	Permission DiskPermission `json:"permission"`
	Remark string `json:"remark"`
	IsOwner bool `json:"isOwner"`
}
