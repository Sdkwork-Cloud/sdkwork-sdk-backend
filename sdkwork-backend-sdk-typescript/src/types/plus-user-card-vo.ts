/** ç¨æ·ä¼åå¡VOï¼ç¨äºè¡¨ç¤ºç¨æ·ä¸ä¼åå¡çç»å®å³ç³» */
export interface PlusUserCardVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·IDï¼å¼ç¨plus_userè¡¨ï¼ */
  userId?: number;
  /** ä¼åå¡æ¨¡æ¿ID */
  cardId?: number;
  /** ç¨æ·ä¼åå¡çå¡å·/Code */
  cardCode?: string;
  /** é¢åæ¶é´ */
  acquireTime?: string;
  /** æ¿æ´»æ¶é´ */
  activateTime?: string;
  /** æ³¨é/å°ææ¶é´ */
  cancelTime?: string;
  /** å½åç§¯åä½é¢ */
  points?: number;
  /** å½åå¨å¼ä½é¢ */
  balance?: number;
}
