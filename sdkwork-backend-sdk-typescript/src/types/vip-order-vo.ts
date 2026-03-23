/** ä¼åè´­ä¹°è®¢åVO */
export interface VipOrderVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** è®¢åID */
  orderId?: number;
  /** è®¢åç¼å· */
  orderSn?: string;
  /** æ¯å¦åå»ºæå */
  success?: boolean;
  /** æ¶æ¯ */
  message?: string;
}
