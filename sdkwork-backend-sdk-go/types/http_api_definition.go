package types


type HttpApiDefinition struct {
	ApiName string `json:"apiName"`
	Description string `json:"description"`
	BaseUrl string `json:"baseUrl"`
	Path string `json:"path"`
	Method string `json:"method"`
	Headers map[string]string `json:"headers"`
	Parameters map[string]interface{} `json:"parameters"`
	RequestFormat string `json:"requestFormat"`
	ResponseFormat string `json:"responseFormat"`
	Authenticated bool `json:"authenticated"`
	TimeoutMillis int `json:"timeoutMillis"`
	RequestBodyFormat string `json:"requestBodyFormat"`
	RequestBody map[string]interface{} `json:"requestBody"`
	AuthType string `json:"authType"`
	AuthParams map[string]interface{} `json:"authParams"`
}
