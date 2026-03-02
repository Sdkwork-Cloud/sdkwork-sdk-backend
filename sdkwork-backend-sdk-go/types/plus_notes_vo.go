package types

// Notes VO
type PlusNotesVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Content string `json:"content"`
	UserId int `json:"userId"`
	UserName string `json:"userName"`
	CategoryId int `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	Tags string `json:"tags"`
	AccessScope string `json:"accessScope"`
	Password string `json:"password"`
	CoverImage ImageMediaResource `json:"coverImage"`
	Status string `json:"status"`
	Remark string `json:"remark"`
	DiskId int `json:"diskId"`
	ParentId int `json:"parentId"`
	Type string `json:"type"`
	Path string `json:"path"`
	RelativePath string `json:"relativePath"`
}
