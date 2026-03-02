package types


type JsonSchema struct {
	Name string `json:"name"`
	Schema map[string]interface{} `json:"schema"`
	Strict bool `json:"strict"`
}
