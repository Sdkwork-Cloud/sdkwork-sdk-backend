package types


type Flow struct {
	Id string `json:"id"`
	Name string `json:"name"`
	Description string `json:"description"`
	Status string `json:"status"`
	Nodes []Node `json:"nodes"`
	Edges []EdgeObject `json:"edges"`
	SubFlows []Flow `json:"subFlows"`
	ParentId int `json:"parentId"`
	StartTime string `json:"startTime"`
	EndTime string `json:"endTime"`
	ParentFlow Flow `json:"parentFlow"`
	AllAgents []PlusAgent `json:"allAgents"`
	LastNode Node `json:"lastNode"`
}
