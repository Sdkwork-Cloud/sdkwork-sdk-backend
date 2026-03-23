/** è®¢åå®ææä½VO */
export interface OrderCompleteVO {
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
  /** å®æçè®¢åID */
  orderId?: number;
  /** å®ææ¶é´ */
  completeTime?: string;
  /** æ¯å¦å·²è¯ä»· */
  reviewed?: boolean;
  /** è·å¾ç§¯åæ°é */
  pointsEarned?: number;
}
