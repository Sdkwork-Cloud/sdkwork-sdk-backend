package types

// Invocation record VO (records API calls, function calls, and other invocation behaviors)
type PlusInvokeRecordVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id int `json:"id"`
	Uuid string `json:"uuid"`
	Type string `json:"type"`
	ApiEndpoint string `json:"apiEndpoint"`
	FunctionName string `json:"functionName"`
	RequestParams map[string]interface{} `json:"requestParams"`
	Headers map[string]interface{} `json:"headers"`
	Status string `json:"status"`
	Duration int `json:"duration"`
	ErrorMsg string `json:"errorMsg"`
	UserId int `json:"userId"`
	ClientIp string `json:"clientIp"`
	ClientLocation string `json:"clientLocation"`
	UserAgent string `json:"userAgent"`
	BrowserInfo string `json:"browserInfo"`
	ClientId string `json:"clientId"`
}
