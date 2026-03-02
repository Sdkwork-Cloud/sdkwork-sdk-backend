package types

// 访问历史VO
type PlusVisitHistoryVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	VisitCount int `json:"visitCount"`
	LastVisitedAt string `json:"lastVisitedAt"`
	Duration int `json:"duration"`
	Source string `json:"source"`
}
