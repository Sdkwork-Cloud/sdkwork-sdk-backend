package types


type PageableObject struct {
	Offset int `json:"offset"`
	Sort SortObject `json:"sort"`
	Paged bool `json:"paged"`
	PageNumber int `json:"pageNumber"`
	PageSize int `json:"pageSize"`
	Unpaged bool `json:"unpaged"`
}
