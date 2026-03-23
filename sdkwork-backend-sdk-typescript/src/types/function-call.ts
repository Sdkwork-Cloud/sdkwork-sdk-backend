/** å½æ°è°ç¨ä¿¡æ¯ï¼å½æ¨¡åå³å®éè¦è°ç¨å·¥å·å½æ°æ¶è¿å */
export interface FunctionCall {
  /** è¦è°ç¨çå½æ°åç§° */
  name: string;
  /** å½æ°åæ°ï¼é®å¼å¯¹å½¢å¼ */
  arguments: Record<string, unknown>;
}
