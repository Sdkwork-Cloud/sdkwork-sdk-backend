package types


type PageUsageRecordVO struct {
	TotalElements int `json:"totalElements"`
	TotalPages int `json:"totalPages"`
	Size int `json:"size"`
	Content []UsageRecordVO `json:"content"`
	Number int `json:"number"`
	First bool `json:"first"`
	Last bool `json:"last"`
	NumberOfElements int `json:"numberOfElements"`
	Sort SortObject `json:"sort"`
	Pageable PageableObject `json:"pageable"`
	Empty bool `json:"empty"`
}
