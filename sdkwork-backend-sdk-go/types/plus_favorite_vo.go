package types

// Favorite VO
type PlusFavoriteVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	FolderId int `json:"folderId"`
	Remark string `json:"remark"`
	Tags string `json:"tags"`
	SortWeight int `json:"sortWeight"`
	Title string `json:"title"`
	Image ImageMediaResource `json:"image"`
	IsPrivate bool `json:"isPrivate"`
	Status string `json:"status"`
	ViewCount int `json:"viewCount"`
	LastViewedAt string `json:"lastViewedAt"`
}
