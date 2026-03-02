package types

// 工具调用对象，包含工具调用的唯一标识、类型和具体函数调用信息
type ChatCompletionMessageToolCall struct {
	Id string `json:"id"`
	Type string `json:"type"`
	Function FunctionCall `json:"function"`
}
