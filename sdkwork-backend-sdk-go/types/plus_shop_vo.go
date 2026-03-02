package types

// Shop VO
type PlusShopVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	UserId int `json:"userId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Logo ImageMediaResource `json:"logo"`
	Cover ImageMediaResource `json:"cover"`
	ContactPhone string `json:"contactPhone"`
	ContactEmail string `json:"contactEmail"`
	Location GeoPoint `json:"location"`
	Address string `json:"address"`
	LicenseNumber string `json:"licenseNumber"`
	Tags []string `json:"tags"`
	Status string `json:"status"`
	BusinessHours string `json:"businessHours"`
}
