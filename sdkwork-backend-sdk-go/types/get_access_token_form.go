package types

// Get access Tokens Form
type GetAccessTokenForm struct {
	Id int `json:"id"`
	Platforms []string `json:"platforms"`
}
