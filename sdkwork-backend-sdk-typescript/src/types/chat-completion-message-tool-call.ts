import type { FunctionCall } from './function-call';

/** å·¥å·è°ç¨å¯¹è±¡ï¼åå«å·¥å·è°ç¨çå¯ä¸æ è¯ãç±»ååå·ä½å½æ°è°ç¨ä¿¡æ¯ */
export interface ChatCompletionMessageToolCall {
  /** å·¥å·è°ç¨çå¯ä¸æ è¯ç¬¦ */
  id: string;
  /** å·¥å·ç±»åï¼å½åä»æ¯æ"function" */
  type: string;
  /** å½æ°è°ç¨è¯¦æä¿¡æ¯ */
  function: FunctionCall;
}
