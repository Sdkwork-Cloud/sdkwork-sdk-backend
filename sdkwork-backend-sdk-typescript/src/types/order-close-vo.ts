/** è®¢åå³é­æä½VO */
export interface OrderCloseVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æä½æ¯å¦æå */
  success?: boolean;
  /** æä½ç»ææ¶æ¯ */
  message?: string;
  /** æä½æ¶é´ */
  operationTime?: string;
  /** å³é­çè®¢åID */
  orderId?: number;
  /** å³é­åå  */
  closeReason?: string;
  /** å³é­æ¶é´ */
  closeTime?: string;
  /** æ¯å¦å¯éæ°æå¼ */
  reopenable?: boolean;
}
