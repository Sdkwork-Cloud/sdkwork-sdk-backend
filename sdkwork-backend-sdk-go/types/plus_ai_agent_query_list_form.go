package types


type PlusAiAgentQueryListForm struct {
	Id int `json:"id"`
	CreatedAtFrom string `json:"createdAtFrom"`
	CreatedAtTo string `json:"createdAtTo"`
	UserId int `json:"userId"`
	Keyword string `json:"keyword"`
	Status string `json:"status"`
	DataScope string `json:"dataScope"`
}
