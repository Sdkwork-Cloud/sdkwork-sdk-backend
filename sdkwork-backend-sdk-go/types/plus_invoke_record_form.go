package types

// Invocation record creation form
type PlusInvokeRecordForm struct {
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
