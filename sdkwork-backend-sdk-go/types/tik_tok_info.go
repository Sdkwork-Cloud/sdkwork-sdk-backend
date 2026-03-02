package types


type TikTokInfo struct {
	UserId string `json:"userId"`
	Username string `json:"username"`
	DisplayName string `json:"displayName"`
	AvatarUrl string `json:"avatarUrl"`
	Bio string `json:"bio"`
	IsVerified bool `json:"isVerified"`
	FollowerCount int `json:"followerCount"`
	FollowingCount int `json:"followingCount"`
	LikeCount int `json:"likeCount"`
}
