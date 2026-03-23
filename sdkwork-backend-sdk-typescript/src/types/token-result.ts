/** ä»¤çç»æä¿¡æ¯ */
export interface TokenResult {
  /** ä»¤çå­ç¬¦ä¸² */
  token: string;
  /** ä»¤çè¿ææ¶é´ï¼æ¯«ç§ï¼ */
  expiresInMs: string;
  /** ä»¤çåå»ºæ¶é´ï¼æ¯«ç§æ¶é´æ³ï¼ */
  createdAt: string;
  expired?: boolean;
}
