package types

// Favorite creation form
type PlusFavoriteForm struct {
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Remark string `json:"remark"`
	SortWeight int `json:"sortWeight"`
	Title string `json:"title"`
	Image ImageMediaResource `json:"image"`
	IsPrivate bool `json:"isPrivate"`
	Status string `json:"status"`
}
