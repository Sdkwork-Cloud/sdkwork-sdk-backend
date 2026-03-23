/** è´¦æ·æµæ°´VO(åå«èµéåç§¯å) */
export interface PlusAccountHistoryVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** èµäº§ç±»å (BALANCE-èµé, POINT-ç§¯å) */
  assetType?: 'DEFAULT' | 'BALANCE' | 'POINT' | 'TOKEN';
  /** å³èçè´¦æ·ID */
  accountId?: number;
  /** å¤é¨äº¤æå·æä¸å¡å¯ä¸æ è¯ï¼ç¨äºå¹ç­æ§å¶ */
  transactionId?: string;
  /** äº¤æç±»å (1-åå¼, 2-æç°, 3-éæ¬¾, 4-è½¬è´¦, 5-è°è´¦, 6-ç§¯åè·å¾, 7-ç§¯åä½¿ç¨, 8-ç§¯åè¿æ, 9-æ¶ç) */
  transactionType?: 'DEFAULT' | 'DEPOSIT' | 'WITHDRAW' | 'REFUND' | 'TRANSFER' | 'ADJUST' | 'INCOME' | 'FROZEN' | 'UNFROZEN' | 'DEDUCT' | 'RECHARGE' | 'CONSUME' | 'POINT_EARN' | 'POINT_USE' | 'POINT_EXPIRE' | 'POINT_TRANSFER' | 'POINT_ADJUST' | 'POINT_REFUND' | 'POINT_FROZEN' | 'POINT_UNFROZEN' | 'TOKEN_DEPOSIT' | 'TOKEN_USE' | 'TOKEN_REFUND' | 'TOKEN_FROZEN' | 'TOKEN_UNFROZEN' | 'TOKEN_TRANSFER' | 'TOKEN_ADJUST' | 'TOKEN_EXPIRE' | 'SYSTEM_ADJUST' | 'OTHER';
  /** åå¨éé¢ (èµéä¸ç¨) */
  amount?: number;
  /** äº¤æåè´¦æ·ä½é¢ (èµéä¸ç¨) */
  balanceBefore?: number;
  /** äº¤æåè´¦æ·ä½é¢ (èµéä¸ç¨) */
  balanceAfter?: number;
  /** å³èè´¦æ·ID (å¦è½¬è´¦æ¶çå¯¹æ¹è´¦æ·) */
  relatedAccountId?: number;
  /** åå¨ç§¯åå¼ (ç§¯åä¸ç¨) */
  pointsChange?: number;
  /** åå¨åè´¦æ·ç§¯å (ç§¯åä¸ç¨) */
  pointsBefore?: number;
  /** åå¨åè´¦æ·ç§¯å (ç§¯åä¸ç¨) */
  pointsAfter?: number;
  /** æ¥æºç±»å (1-è®¢å, 2-æ´»å¨, 3-ç­¾å°, 4-åäº«, 5-éè¯·, 6-ç³»ç»å¥å±, 99-å¶ä») */
  sourceType?: 'DEFAULT' | 'ORDER' | 'ACTIVITY' | 'SIGN_IN' | 'SHARE' | 'INVITE' | 'SYSTEM' | 'OTHER';
  /** æ¥æºä¸å¡ID (å¦è®¢åIDãæ´»å¨ID) */
  sourceId?: string;
  /** ç§¯åè¿ææ¶é´ (ç§¯åä¸ç¨) */
  expiredAt?: string;
  /** äº¤æç¶æ (1-å¤çä¸­, 2-æå, 3-å¤±è´¥) */
  status?: 'DEFAULT' | 'PROCESSING' | 'SUCCESS' | 'FAILED' | 'CANCELLED';
  /** å¤æ³¨ä¿¡æ¯ï¼å¯å­JSONæå¶ä»ææ¬ */
  remarks?: string;
}
