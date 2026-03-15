package types


type GenerationContext struct {
	GenerationId int `json:"generationId"`
	GenerationType string `json:"generationType"`
	GenerationStatus string `json:"generationStatus"`
	Channel string `json:"channel"`
	RequestId string `json:"requestId"`
	ChannelTaskId string `json:"channelTaskId"`
	RoutingStrategy string `json:"routingStrategy"`
	RoutingProduct string `json:"routingProduct"`
	RoutingProvider string `json:"routingProvider"`
}
