package types

// Result of retrieving user information
type GetUserInfoResponse struct {
	UserId string `json:"userId"`
	OpenId string `json:"openId"`
	UnionId string `json:"unionId"`
	Username string `json:"username"`
	Email string `json:"email"`
	EmailVerified bool `json:"emailVerified"`
	FullName string `json:"fullName"`
	AvatarUrl string `json:"avatarUrl"`
	Gender string `json:"gender"`
	Nickname string `json:"nickname"`
	Sex int `json:"sex"`
	City string `json:"city"`
	Province string `json:"province"`
	Country string `json:"country"`
	Privileges []string `json:"privileges"`
	Bio string `json:"bio"`
	Blog string `json:"blog"`
	Location string `json:"location"`
	Company string `json:"company"`
	FirstName string `json:"firstName"`
	LastName string `json:"lastName"`
	Locale string `json:"locale"`
	Mobile string `json:"mobile"`
	JobTitle string `json:"jobTitle"`
	OfficeLocation string `json:"officeLocation"`
}
