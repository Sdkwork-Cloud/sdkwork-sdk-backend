package types


type PagePlusHostDomainVO struct {
	TotalPages int `json:"totalPages"`
	TotalElements int `json:"totalElements"`
	Size int `json:"size"`
	Content []PlusHostDomainVO `json:"content"`
	Number int `json:"number"`
	Sort SortObject `json:"sort"`
	First bool `json:"first"`
	Last bool `json:"last"`
	NumberOfElements int `json:"numberOfElements"`
	Pageable PageableObject `json:"pageable"`
	Empty bool `json:"empty"`
}
