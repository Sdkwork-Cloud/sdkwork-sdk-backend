package types

// Notes form
type PlusNotesForm struct {
	Id int `json:"id"`
	Title string `json:"title"`
	Content string `json:"content"`
	UserId int `json:"userId"`
	CategoryId int `json:"categoryId"`
	Tags string `json:"tags"`
	AccessScope string `json:"accessScope"`
	Password string `json:"password"`
	CoverImage ImageMediaResource `json:"coverImage"`
	Status string `json:"status"`
	Remark string `json:"remark"`
	DiskId int `json:"diskId"`
	ParentId int `json:"parentId"`
	Type string `json:"type"`
	TagsAsTagsContent TagsContent `json:"tagsAsTagsContent"`
}
