package types

// Collection Item VO
type PlusCollectionItemVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CollectionId int `json:"collectionId"`
	CollectionUuid string `json:"collectionUuid"`
	Type string `json:"type"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	ContentUuid string `json:"contentUuid"`
	Title string `json:"title"`
	Description string `json:"description"`
	Position int `json:"position"`
	IsPinned bool `json:"isPinned"`
	Tags string `json:"tags"`
	ExtraData string `json:"extraData"`
}
