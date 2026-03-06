package types


type PageableObject struct {
	Offset int `json:"offset"`
	Paged bool `json:"paged"`
	Sort SortObject `json:"sort"`
	PageNumber int `json:"pageNumber"`
	PageSize int `json:"pageSize"`
	Unpaged bool `json:"unpaged"`
}
