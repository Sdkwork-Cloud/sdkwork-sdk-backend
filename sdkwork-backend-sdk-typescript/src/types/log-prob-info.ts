/** æ¥å¿æ¦çä¿¡æ¯ï¼åå«çæææ¬çæ¦çåå¸ä¿¡æ¯ï¼ä»å¨è¯·æ±æ¶æå®äºlogprobsåæ°æ¶è¿å */
export interface LogProbInfo {
  /** çæçtokenåè¡¨ */
  tokens?: string[];
  /** æ¯ä¸ªtokençå¯¹æ°æ¦ç */
  token_logprobs?: number[];
  /** æ¯ä¸ªtokençå­èåç§»é */
  text_offset?: number[];
}
