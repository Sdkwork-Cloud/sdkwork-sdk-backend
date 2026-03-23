import type { ChatCompletionMessage } from './chat-completion-message';
import type { LogProbInfo } from './log-prob-info';

/** èå¤©å®æååºä¸­çéé¡¹å¯¹è±¡ */
export interface ChatCompletionChoice {
  /** éé¡¹ç´¢å¼ */
  index: number;
  /** æ¨¡åçæçæ¶æ¯ */
  message: ChatCompletionMessage;
  /** æ¥å¿æ¦çä¿¡æ¯ï¼ä»å¨è¯·æ±æ¶æå®äºlogprobsåæ°æ¶è¿åï¼ */
  logprobs?: LogProbInfo;
  /** å®æåå ï¼å¯è½çå¼ï¼"stop"ï¼æ­£å¸¸åæ­¢ï¼ã"length"ï¼è¾¾å°é¿åº¦éå¶ï¼ã"function_call"ï¼éè¦è°ç¨å½æ°ï¼ç­ */
  finish_reason: string;
}
