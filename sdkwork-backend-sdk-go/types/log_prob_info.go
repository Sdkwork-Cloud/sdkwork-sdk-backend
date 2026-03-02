package types

// 日志概率信息，包含生成文本的概率分布信息，仅在请求时指定了logprobs参数时返回
type LogProbInfo struct {
	Tokens []string `json:"tokens"`
	TokenLogprobs []float64 `json:"token_logprobs"`
	TextOffset []int `json:"text_offset"`
}
