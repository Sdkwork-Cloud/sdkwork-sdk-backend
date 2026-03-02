package types

// VIP套餐分组查询Form
type PlusVipPackGroupQueryForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	AppId int `json:"appId"`
	AppIdIn []int `json:"appIdIn"`
}
