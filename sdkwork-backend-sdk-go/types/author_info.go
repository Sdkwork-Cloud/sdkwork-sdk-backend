package types


type AuthorInfo struct {
	Id int `json:"id"`
	FaceImage ImageMediaResource `json:"faceImage"`
	Name string `json:"name"`
	Email string `json:"email"`
	Bio string `json:"bio"`
	Website string `json:"website"`
}
