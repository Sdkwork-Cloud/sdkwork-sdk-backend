package types


type AttributeItem struct {
	Id int `json:"id"`
	Name string `json:"name"`
	Values []string `json:"values"`
}
