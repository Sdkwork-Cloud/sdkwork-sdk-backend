package types

// Visit record creation form
type PlusShareVisitRecordForm struct {
	ShareId int `json:"shareId"`
	IpAddress string `json:"ipAddress"`
	UserAgent string `json:"userAgent"`
	AccessedAt string `json:"accessedAt"`
	Success bool `json:"success"`
}
