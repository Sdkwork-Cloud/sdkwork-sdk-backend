package types

// PPT template rendering parameters including template ID, dynamic data and theme settings
type PlusPptTemplateRenderForm struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Prompt string `json:"prompt"`
}
