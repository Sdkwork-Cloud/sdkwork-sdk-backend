package types


type Function struct {
	Description string `json:"description"`
	Name string `json:"name"`
	Parameters map[string]interface{} `json:"parameters"`
	Strict bool `json:"strict"`
}
