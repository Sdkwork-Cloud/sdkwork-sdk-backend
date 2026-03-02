package types


type LinkedInInfo struct {
	UserId string `json:"userId"`
	Username string `json:"username"`
	FullName string `json:"fullName"`
	ProfilePictureUrl string `json:"profilePictureUrl"`
	Headline string `json:"headline"`
	Position string `json:"position"`
	Company string `json:"company"`
	Industry string `json:"industry"`
	Education string `json:"education"`
	Location string `json:"location"`
}
