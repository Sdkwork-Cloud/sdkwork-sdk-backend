package types

// 函数调用信息，当模型决定需要调用工具函数时返回
type FunctionCall struct {
	Name string `json:"name"`
	Arguments map[string]interface{} `json:"arguments"`
}
