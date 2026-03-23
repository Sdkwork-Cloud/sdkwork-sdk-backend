/** ä¼æ å¸æ¨¡æ¿VOï¼å®ä¹ä¼æ å¸å±æ§ */
export interface PlusCouponVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¼æ å¸åç§° */
  name?: string;
  /** ä¼æ å¸åæ¢ç  */
  redeemCode?: string;
  /** åæ¢æéç§¯åï¼0è¡¨ç¤ºåè´¹é¢å */
  pointCost?: number;
  /** ä¼æ å¸ç±»åï¼æ»¡å/ææ£/ç¤¼åç­ */
  type?: 'DEFAULT' | 'CASH' | 'DISCOUNT' | 'GIFT' | 'GROUPON' | 'NORMAL' | 'POINTS_EXCHANGE';
  /** ä¼æ å¸æè¿° */
  description?: string;
  /** æµæ£éé¢ï¼åä½ï¼åï¼ï¼è¥æ¯ææ£å¸å¯ä¸º0 */
  amount?: number;
  /** ææ£çï¼å¦ 0.8 è¡¨ç¤º8æï¼ */
  discount?: number;
  /** æ»¡åå¸ä½¿ç¨é¨æ§éé¢ï¼åä½ï¼åï¼ */
  minConsume?: number;
  /** çæå¼å§æ¶é´ */
  startTime?: string;
  /** çæç»ææ¶é´ */
  endTime?: string;
  /** åæ¾æ»é */
  total?: number;
  /** æ¯äººé¢åä¸é */
  getLimit?: number;
  /** ä¼æ å¸ç¶æï¼å¯ç¨/è¿æ/æ¤éç­ */
  status?: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
  /** éç¨èå´ç±»å */
  scopeType?: 'DEFAULT' | 'ALL' | 'VIP_ONLY' | 'CUSTOM';
  /** éç¨èå´å¼ */
  scopeValue?: string;
}
