package types


type TwitterInfo struct {
	UserId string `json:"userId"`
	Username string `json:"username"`
	DisplayName string `json:"displayName"`
	AvatarUrl string `json:"avatarUrl"`
	Bio string `json:"bio"`
	Location string `json:"location"`
	Website string `json:"website"`
}
