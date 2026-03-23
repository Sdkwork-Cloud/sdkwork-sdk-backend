/** VIPåå¼è®°å½Value Object */
export interface PlusVipRechargeVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¼åç­çº§ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** ç¨æ·IDï¼å³èplus_userè¡¨ */
  userId?: number;
  /** VIPç­çº§IDï¼å³èplus_vip_levelè¡¨ */
  vipLevelId?: number;
  /** åå¼éé¢(å) */
  amount?: number;
  /** åå¼è·å¾ççµç¹æ°é */
  pointAmount?: number;
  /** åå¼ç±»å */
  rechargeType?: 'DEFAULT' | 'DIRECT' | 'PACKAGE' | 'PROMOTION' | 'GIFT';
  /** åå¼æ¶é´ */
  rechargeTime?: string;
  /** äº¤ææµæ°´å· */
  transactionNo?: string;
  /** åå¼ç¶æ(1-æå 2-å¤±è´¥ 3-å¤çä¸­) */
  status?: number;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
}
