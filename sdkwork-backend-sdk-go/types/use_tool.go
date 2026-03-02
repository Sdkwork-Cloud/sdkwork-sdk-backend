package types


type UseTool struct {
	Id int `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Enable bool `json:"enable"`
}
