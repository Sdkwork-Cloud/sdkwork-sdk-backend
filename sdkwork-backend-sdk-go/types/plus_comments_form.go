package types

// Comment creation form with content details
type PlusCommentsForm struct {
	Content string `json:"content"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	Status string `json:"status"`
	Rating int `json:"rating"`
	Likes int `json:"likes"`
	ReplyCount int `json:"replyCount"`
	IsTop bool `json:"isTop"`
	IpAddress string `json:"ipAddress"`
	DeviceInfo string `json:"deviceInfo"`
	ParentId int `json:"parentId"`
	ParentUuid string `json:"parentUuid"`
	UserId int `json:"userId"`
	ParentMetadata PlusTreeParentMetadata `json:"parentMetadata"`
}
