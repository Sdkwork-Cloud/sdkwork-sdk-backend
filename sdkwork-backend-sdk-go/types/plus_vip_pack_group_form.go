package types

// VIP package group creation form
type PlusVipPackGroupForm struct {
	AppId int `json:"appId"`
	Name string `json:"name"`
	Description string `json:"description"`
	SortWeight int `json:"sortWeight"`
	Status string `json:"status"`
	Remark string `json:"remark"`
}
