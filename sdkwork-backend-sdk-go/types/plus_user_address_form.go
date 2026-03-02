package types

// Address creation form data
type PlusUserAddressForm struct {
	Name string `json:"name"`
	Phone string `json:"phone"`
	CountryCode string `json:"countryCode"`
	ProvinceCode string `json:"provinceCode"`
	CityCode string `json:"cityCode"`
	DistrictCode string `json:"districtCode"`
	AddressDetail string `json:"addressDetail"`
	PostalCode string `json:"postalCode"`
	IsDefault bool `json:"isDefault"`
	Tags TagsContent `json:"tags"`
}
