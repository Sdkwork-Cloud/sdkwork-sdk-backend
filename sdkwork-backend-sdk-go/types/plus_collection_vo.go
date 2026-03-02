package types

// Collection VO
type PlusCollectionVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	ContentId int `json:"contentId"`
	CoverImage string `json:"coverImage"`
	IsPublic bool `json:"isPublic"`
	IsPinned bool `json:"isPinned"`
	Sort int `json:"sort"`
	ItemCount int `json:"itemCount"`
	ViewCount int `json:"viewCount"`
	FavoriteCount int `json:"favoriteCount"`
	LastUpdatedAt string `json:"lastUpdatedAt"`
	ParentId int `json:"parentId"`
	ChildrenIds []int `json:"childrenIds"`
}
