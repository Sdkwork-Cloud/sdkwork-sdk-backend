package types


type PlusUser struct {
	TenantId int `json:"tenantId"`
	OrganizationId int `json:"organizationId"`
	DataScope string `json:"dataScope"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	V int `json:"v"`
	Username string `json:"username"`
	Nickname string `json:"nickname"`
	Password string `json:"password"`
	Platform string `json:"platform"`
	Type string `json:"type"`
	Gender string `json:"gender"`
	FaceImage ImageMediaResource `json:"faceImage"`
	FaceVideo VideoMediaResource `json:"faceVideo"`
	Salt string `json:"salt"`
	Scene string `json:"scene"`
	Email string `json:"email"`
	Phone string `json:"phone"`
	CountryCode string `json:"countryCode"`
	ProvinceCode string `json:"provinceCode"`
	CityCode string `json:"cityCode"`
	DistrictCode string `json:"districtCode"`
	Address string `json:"address"`
	Bio string `json:"bio"`
	BirthDate string `json:"birthDate"`
	OauthUserInfo GetUserInfoResponse `json:"oauthUserInfo"`
	Status string `json:"status"`
	Roles []PlusRole `json:"roles"`
	Metadata UserMetadata `json:"metadata"`
	SocialInfoList SocialInfoList `json:"socialInfoList"`
	RoleCodes []string `json:"roleCodes"`
	Authorities []GrantedAuthority `json:"authorities"`
}
