package types

// File disk creation form
type PlusDiskForm struct {
	Name string `json:"name"`
	Owner string `json:"owner"`
	OwnerId int `json:"ownerId"`
	DiskSize int `json:"diskSize"`
	UsedSize int `json:"usedSize"`
	Description string `json:"description"`
}
