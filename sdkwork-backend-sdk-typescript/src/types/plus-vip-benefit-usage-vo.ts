/** VIPæçä½¿ç¨è®°å½VO */
export interface PlusVipBenefitUsageVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·IDï¼å³èplus_userè¡¨ */
  userId?: number;
  /** æçç±»å */
  benefitType?: 'DEFAULT' | 'MONTHLY_FREE_POINTS' | 'DEDICATED_SUPPORT' | 'PURCHASE_DISCOUNT' | 'EXCLUSIVE_CONTENT' | 'PRIORITY_SERVICE' | 'BIRTHDAY_GIFT';
  /** ä½¿ç¨æ¶é´ */
  usageTime?: string;
  /** ä½¿ç¨æ°é */
  usageCount?: number;
  /** ç¶æ(1-æå 2-å¤±è´¥) */
  status?: number;
  /** ä¸å¡æ¥æºID(å¦è®¢åIDç­) */
  sourceId?: number;
  /** ä¸å¡æ¥æºç±»å */
  sourceType?: string;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
}
