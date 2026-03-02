package types

// 用户地址VO
type PlusUserAddressVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
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
