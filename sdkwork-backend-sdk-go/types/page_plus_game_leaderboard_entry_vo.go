package types


type PagePlusGameLeaderboardEntryVO struct {
	TotalElements int `json:"totalElements"`
	TotalPages int `json:"totalPages"`
	Size int `json:"size"`
	Content []PlusGameLeaderboardEntryVO `json:"content"`
	Number int `json:"number"`
	NumberOfElements int `json:"numberOfElements"`
	Sort SortObject `json:"sort"`
	Pageable PageableObject `json:"pageable"`
	First bool `json:"first"`
	Last bool `json:"last"`
	Empty bool `json:"empty"`
}
