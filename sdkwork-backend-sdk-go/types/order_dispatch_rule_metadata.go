package types


type OrderDispatchRuleMetadata struct {
	RatingConcurrentLimits map[string]int `json:"ratingConcurrentLimits"`
	AllowedRatingLevels []string `json:"allowedRatingLevels"`
}
