/** ç¨æ·ä¼æ å¸VOï¼è®°å½ç¨æ·ææçä¼æ å¸ä¿¡æ¯ */
export interface PlusUserCouponVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¨æ·ID */
  userId?: number;
  /** ä¼æ å¸æ¨¡æ¿ID */
  couponId?: number;
  /** ç¨æ·ä¼æ å¸çå¯ä¸ç¼ç  */
  couponCode?: string;
  /** é¢åæ¶é´ */
  acquireTime?: string;
  /** é¢åè¯·æ±å·(å¹ç­é®) */
  acquireRequestNo?: string;
  /** é¢åæ¹å¼ */
  acquireType?: 'DEFAULT' | 'RECEIVE' | 'REDEEM_CODE' | 'POINTS_EXCHANGE' | 'ADMIN_GRANT';
  /** é¢åæ¶èç§¯å */
  pointCost?: number;
  /** æ¯å¦å·²éåç§¯å */
  pointsRefunded?: boolean;
  /** ç§¯åéåæ¶é´ */
  pointsRefundAt?: string;
  /** ä½¿ç¨æ¶é´ */
  useTime?: string;
  /** ä½¿ç¨ç¶æï¼æªä½¿ç¨/å·²ä½¿ç¨/å·²è¿æç­ */
  status?: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
}
