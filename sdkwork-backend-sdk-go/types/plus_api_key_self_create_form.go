package types

// Current user API key creation form
type PlusApiKeySelfCreateForm struct {
	Name string `json:"name"`
	Type string `json:"type"`
	ExpireTime string `json:"expireTime"`
	Description string `json:"description"`
}
