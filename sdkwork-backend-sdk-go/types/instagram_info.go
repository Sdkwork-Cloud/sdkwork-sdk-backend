package types


type InstagramInfo struct {
	UserId string `json:"userId"`
	Username string `json:"username"`
	FullName string `json:"fullName"`
	ProfilePictureUrl string `json:"profilePictureUrl"`
	Bio string `json:"bio"`
	Website string `json:"website"`
	IsBusinessAccount bool `json:"isBusinessAccount"`
}
