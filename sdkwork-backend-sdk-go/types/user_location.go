package types


type UserLocation struct {
	Type string `json:"type"`
	Approximate Approximate `json:"approximate"`
}
