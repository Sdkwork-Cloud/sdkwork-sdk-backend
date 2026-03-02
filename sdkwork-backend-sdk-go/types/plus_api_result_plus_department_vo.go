package types

// API调用结果
type PlusApiResultPlusDepartmentVO struct {
	Data PlusDepartmentVO `json:"data"`
	Code string `json:"code"`
	Msg string `json:"msg"`
	RequestId string `json:"requestId"`
	Ip string `json:"ip"`
	Hostname string `json:"hostname"`
	ErrorName string `json:"errorName"`
}
