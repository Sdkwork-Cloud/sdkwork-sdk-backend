package types


type FacebookInfo struct {
	UserId string `json:"userId"`
	Username string `json:"username"`
	Name string `json:"name"`
	AvatarUrl string `json:"avatarUrl"`
	Email string `json:"email"`
	Gender string `json:"gender"`
	Country string `json:"country"`
	City string `json:"city"`
}
