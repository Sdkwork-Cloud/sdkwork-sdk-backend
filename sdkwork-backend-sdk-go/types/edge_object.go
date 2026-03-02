package types


type EdgeObject struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	SourceNodeId string `json:"sourceNodeId"`
	TargetNodeId string `json:"targetNodeId"`
	Type string `json:"type"`
	Condition interface{} `json:"condition"`
}
