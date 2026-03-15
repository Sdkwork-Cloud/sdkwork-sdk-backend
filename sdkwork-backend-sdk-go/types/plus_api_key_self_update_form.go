package types

// Current user API key update form
type PlusApiKeySelfUpdateForm struct {
	Name string `json:"name"`
	ExpireTime string `json:"expireTime"`
	ClearExpireTime bool `json:"clearExpireTime"`
	Description string `json:"description"`
}
