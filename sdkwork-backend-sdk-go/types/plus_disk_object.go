package types


type PlusDiskObject struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	Name string `json:"name"`
	Type string `json:"type"`
	Description string `json:"description"`
	DiskSize int `json:"diskSize"`
	UsedSize int `json:"usedSize"`
}
