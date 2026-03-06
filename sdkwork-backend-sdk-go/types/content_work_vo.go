package types

// Content Work VO
type ContentWorkVO struct {
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Title string `json:"title"`
	Type string `json:"type"`
	TypeDesc string `json:"typeDesc"`
	Description string `json:"description"`
	CoverUrl string `json:"coverUrl"`
	Path string `json:"path"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
}
