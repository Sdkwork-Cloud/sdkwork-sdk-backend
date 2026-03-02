package types

// Disk member creation form
type PlusDiskMemberForm struct {
	DiskId int `json:"diskId"`
	UserId int `json:"userId"`
	Permission DiskPermission `json:"permission"`
	Remark string `json:"remark"`
	IsOwner bool `json:"isOwner"`
}
