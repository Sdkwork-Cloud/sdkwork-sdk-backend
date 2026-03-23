/** VIPç§¯ååå¨è®°å½VO */
export interface PlusVipPointChangeVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·IDï¼å³èplus_userè¡¨ */
  userId?: number;
  /** åå¨ç±»å */
  changeType?: 'DEFAULT' | 'RECHARGE' | 'CONSUME' | 'REWARD' | 'ADJUST' | 'EXPIRE';
  /** åå¨æ°é(æ­£æ°ä¸ºå¢å ï¼è´æ°ä¸ºåå°) */
  changeAmount?: number;
  /** åå¨åä½é¢ */
  beforeBalance?: number;
  /** åå¨åä½é¢ */
  afterBalance?: number;
  /** ä¸å¡æ¥æºID(å¦åå¼è®°å½IDãè®¢åIDç­) */
  sourceId?: number;
  /** ä¸å¡æ¥æºç±»å */
  sourceType?: 'DEFAULT' | 'PURCHASE' | 'DAILY_REWARD' | 'COUPON_POINTS_EXCHANGE' | 'COUPON_POINTS_ROLLBACK' | 'SYSTEM' | 'OTHER';
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
}
