package types

// VIP套餐分组VO
type PlusVipPackGroupVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	AppId int `json:"appId"`
	Name string `json:"name"`
	Description string `json:"description"`
	SortWeight int `json:"sortWeight"`
	Status string `json:"status"`
	Remark string `json:"remark"`
	Packs []PlusVipPackVO `json:"packs"`
}
