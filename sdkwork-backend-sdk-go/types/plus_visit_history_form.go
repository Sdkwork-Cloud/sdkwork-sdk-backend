package types

// Visit history creation form
type PlusVisitHistoryForm struct {
	ContentType string `json:"contentType"`
	ContentId int `json:"contentId"`
	VisitCount int `json:"visitCount"`
	LastVisitedAt string `json:"lastVisitedAt"`
	Duration int `json:"duration"`
	Source string `json:"source"`
}
