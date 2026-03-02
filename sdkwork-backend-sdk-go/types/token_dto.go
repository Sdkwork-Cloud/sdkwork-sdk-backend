package types


type TokenDTO struct {
	Token string `json:"token"`
	RefreshToken string `json:"refreshToken"`
	ExpiresIn int `json:"expiresIn"`
	RefreshExpiresIn int `json:"refreshExpiresIn"`
	UserId int `json:"userId"`
	Im map[string]interface{} `json:"im"`
}
