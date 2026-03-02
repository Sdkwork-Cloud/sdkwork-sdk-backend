package types

// 用户个人资料VO
type PlusUserProfileVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	FaceImage ImageMediaResource `json:"faceImage"`
	FaceVideo VideoMediaResource `json:"faceVideo"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	Gender string `json:"gender"`
	Status string `json:"status"`
	CountryCode string `json:"countryCode"`
	ProvinceCode string `json:"provinceCode"`
	CityCode string `json:"cityCode"`
	DistrictCode string `json:"districtCode"`
	Address string `json:"address"`
	Bio string `json:"bio"`
	BirthDate string `json:"birthDate"`
	SocialInfoList SocialInfoList `json:"socialInfoList"`
}
