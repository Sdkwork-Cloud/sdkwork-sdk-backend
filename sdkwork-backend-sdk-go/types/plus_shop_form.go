package types

// Shop creation form
type PlusShopForm struct {
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
