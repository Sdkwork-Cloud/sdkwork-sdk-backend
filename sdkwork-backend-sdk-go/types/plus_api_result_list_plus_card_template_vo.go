package types

// API调用结果
type PlusApiResultListPlusCardTemplateVO struct {
	Data []PlusCardTemplateVO `json:"data"`
	Code string `json:"code"`
	Msg string `json:"msg"`
	RequestId string `json:"requestId"`
	Ip string `json:"ip"`
	Hostname string `json:"hostname"`
	ErrorName string `json:"errorName"`
}
