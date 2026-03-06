package types

// File directory tree node VO
type FileTreeNodeVO struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Name string `json:"name"`
	Type string `json:"type"`
	IsDirectory bool `json:"isDirectory"`
	Path string `json:"path"`
	RelativePath string `json:"relativePath"`
	Size int `json:"size"`
	Content string `json:"content"`
	ParentId int `json:"parentId"`
	Children []FileTreeNodeVO `json:"children"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Extension string `json:"extension"`
	Description string `json:"description"`
	ReadOnly bool `json:"readOnly"`
}
