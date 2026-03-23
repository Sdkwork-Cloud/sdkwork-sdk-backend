import type { CompletionTokensDetails } from './completion-tokens-details';
import type { PromptTokensDetails } from './prompt-tokens-details';

/** å®æååºçä½¿ç¨ç»è®¡ä¿¡æ¯ï¼åå«tokenä½¿ç¨æåµ */
export interface CompletionUsage {
  /** æç¤ºè¯ä½¿ç¨çtokenæ°é */
  prompt_tokens: number;
  /** ååºåå®¹ä½¿ç¨çtokenæ°é */
  completion_tokens: number;
  /** æ»tokenä½¿ç¨æ°é */
  total_tokens: number;
  /** ç¨æ· prompt ä¸­ï¼å½ä¸­ä¸ä¸æç¼å­ç token æ° */
  prompt_cache_hit_tokens: number;
  /** ç¨æ· prompt ä¸­ï¼æªå½ä¸­ä¸ä¸æç¼å­ç token æ° */
  prompt_cache_miss_tokens: number;
  /** æç¤ºè¯ç¼å­tokenè¯¦æ */
  prompt_tokens_details?: PromptTokensDetails;
  /** ååºåå®¹tokenè¯¦æ */
  completion_tokens_details?: CompletionTokensDetails;
}
