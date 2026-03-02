package types


type WebSearchOptions struct {
	SearchContextSize string `json:"search_context_size"`
	UserLocation UserLocation `json:"user_location"`
}
