package types

// API调用结果
type PlusApiResultPagePlusChannelVO struct {
	Data PagePlusChannelVO `json:"data"`
	Code string `json:"code"`
	Msg string `json:"msg"`
	RequestId string `json:"requestId"`
	Ip string `json:"ip"`
	Hostname string `json:"hostname"`
	ErrorName string `json:"errorName"`
}
