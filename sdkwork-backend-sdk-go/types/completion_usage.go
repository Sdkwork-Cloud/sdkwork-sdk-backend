package types

// 完成响应的使用统计信息，包含token使用情况
type CompletionUsage struct {
	PromptTokens int `json:"prompt_tokens"`
	CompletionTokens int `json:"completion_tokens"`
	TotalTokens int `json:"total_tokens"`
	PromptCacheHitTokens int `json:"prompt_cache_hit_tokens"`
	PromptCacheMissTokens int `json:"prompt_cache_miss_tokens"`
	PromptTokensDetails PromptTokensDetails `json:"prompt_tokens_details"`
	CompletionTokensDetails CompletionTokensDetails `json:"completion_tokens_details"`
}
