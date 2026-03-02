package types


type Pageable struct {
	Page int `json:"page"`
	Size int `json:"size"`
	Sort []string `json:"sort"`
}
