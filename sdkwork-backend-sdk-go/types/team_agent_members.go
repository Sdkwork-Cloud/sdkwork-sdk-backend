package types


type TeamAgentMembers struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Type string `json:"type"`
	BizType string `json:"bizType"`
	Description string `json:"description"`
	Agents []interface{} `json:"agents"`
}
