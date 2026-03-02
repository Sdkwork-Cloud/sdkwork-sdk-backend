package types


type GeoPoint struct {
	Longitude float64 `json:"longitude"`
	Latitude float64 `json:"latitude"`
	Valid bool `json:"valid"`
}
