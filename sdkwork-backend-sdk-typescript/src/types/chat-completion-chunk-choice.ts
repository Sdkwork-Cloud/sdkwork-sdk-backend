import type { ChatCompletionChunkDelta } from './chat-completion-chunk-delta';
import type { LogProbInfo } from './log-prob-info';

/** æµå¼èå¤©å®æååºä¸­çéé¡¹å¯¹è±¡ï¼åå«æ¨¡åçæçååºåå®¹å */
export interface ChatCompletionChunkChoice {
  /** éé¡¹ç´¢å¼ */
  index: number;
  /** æ¨¡åçæçæ¶æ¯å¢éåå®¹ï¼å®¢æ·ç«¯éè¦å°ææchunkçdeltaæ¼æ¥èµ·æ¥å½¢æå®æ´æ¶æ¯ */
  delta?: ChatCompletionChunkDelta;
  /** æ¥å¿æ¦çä¿¡æ¯ï¼ä»å¨è¯·æ±æ¶æå®äºlogprobsåæ°æ¶è¿åï¼ */
  logprobs?: LogProbInfo;
  /** å®æåå ï¼å¯è½çå¼ï¼"stop"ï¼æ­£å¸¸åæ­¢ï¼ã"length"ï¼è¾¾å°é¿åº¦éå¶ï¼ã"function_call"ï¼éè¦è°ç¨å½æ°ï¼ç­ï¼å¨æµå¼ååºä¸­åªææåä¸ä¸ªchunkä¼åå«énullçå®æåå  */
  finish_reason?: string;
}
