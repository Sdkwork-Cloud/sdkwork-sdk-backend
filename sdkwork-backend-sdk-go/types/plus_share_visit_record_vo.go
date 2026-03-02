package types

// 分享访问记录Value Object
type PlusShareVisitRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	ShareId int `json:"shareId"`
	IpAddress string `json:"ipAddress"`
	UserAgent string `json:"userAgent"`
	AccessedAt string `json:"accessedAt"`
	Success bool `json:"success"`
}
