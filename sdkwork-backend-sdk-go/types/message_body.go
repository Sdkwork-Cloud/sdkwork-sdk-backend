package types


type MessageBody struct {
	Id string `json:"id"`
	Completion ChatCompletion `json:"completion"`
	Payload MsgPayload `json:"payload"`
	Chunk ChatCompletionChunk `json:"chunk"`
	AudioFrame AudioMediaResource `json:"audioFrame"`
	GroupInfos map[string]GroupInfo `json:"groupInfos"`
	Groups map[string][]ChatCompletionChunk `json:"groups"`
	ThinkStart int `json:"thinkStart"`
	ThinkEnd int `json:"thinkEnd"`
	State ChatState `json:"state"`
}
