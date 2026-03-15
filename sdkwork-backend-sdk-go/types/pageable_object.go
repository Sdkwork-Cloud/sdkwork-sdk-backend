package types


type PageableObject struct {
	Offset int `json:"offset"`
	Paged bool `json:"paged"`
	Sort SortObject `json:"sort"`
	PageSize int `json:"pageSize"`
	PageNumber int `json:"pageNumber"`
	Unpaged bool `json:"unpaged"`
}
