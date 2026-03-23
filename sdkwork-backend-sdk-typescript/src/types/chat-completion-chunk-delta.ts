import type { ChatCompletionAudio } from './chat-completion-audio';
import type { ChatCompletionMessageToolCall } from './chat-completion-message-tool-call';

/** èå¤©æ¶æ¯å¯¹è±¡ï¼åå«æ¶æ¯çè§è²ãåå®¹åå·¥å·è°ç¨ä¿¡æ¯ */
export interface ChatCompletionChunkDelta {
  /** æ¶æ¯åéèè§è²ï¼å¯è½çå¼ï¼"system"ï¼ç³»ç»æ¶æ¯ï¼ã"user"ï¼ç¨æ·æ¶æ¯ï¼ã"assistant"ï¼å©ææ¶æ¯ï¼ã"function"ï¼å½æ°è¿åç»ææ¶æ¯ï¼ã"tool"ï¼å·¥å·è¿åç»ææ¶æ¯ï¼ */
  role: string;
  /** æ¶æ¯åå®¹ï¼å¯¹äºå·¥å·/å½æ°è¿åç»ææ¶æ¯ï¼contentä¸ºå¯¹åºçè¿åç»æ */
  content: string;
  /** é³é¢æ¶æ¯ */
  audio?: ChatCompletionAudio;
  /** ä»éç¨äº reasoner æ¨¡åãåå®¹ä¸º assistant æ¶æ¯ä¸­å¨æç»ç­æ¡ä¹åçæ¨çåå®¹ */
  reasoning_content?: string;
  /** å·¥å·è°ç¨åè¡¨ï¼ä»å½roleä¸º"assistant"ä¸éè¦è°ç¨å·¥å·æ¶å­å¨ */
  tool_calls?: ChatCompletionMessageToolCall[];
}
