package types


type ResponseFormat struct {
	Type string `json:"type"`
	JsonSchema JsonSchema `json:"json_schema"`
}
