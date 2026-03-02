package types


type Node struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	Properties map[string]interface{} `json:"properties"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	Agents []PlusAgent `json:"agents"`
}
