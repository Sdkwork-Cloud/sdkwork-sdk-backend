import type { CompletionTokensDetails } from './completion-tokens-details';
import type { PromptTokensDetails } from './prompt-tokens-details';

/** 完成响应的使用统计信息，包含token使用情况 */
export interface CompletionUsage {
  /** 提示词使用的token数量 */
  prompt_tokens: number;
  /** 响应内容使用的token数量 */
  completion_tokens: number;
  /** 总token使用数量 */
  total_tokens: number;
  /** 用户 prompt 中，命中上下文缓存的 token 数 */
  prompt_cache_hit_tokens: number;
  /** 用户 prompt 中，未命中上下文缓存的 token 数 */
  prompt_cache_miss_tokens: number;
  /** 提示词缓存token详情 */
  prompt_tokens_details?: PromptTokensDetails;
  /** 响应内容token详情 */
  completion_tokens_details?: CompletionTokensDetails;
}
