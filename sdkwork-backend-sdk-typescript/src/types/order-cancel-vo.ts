/** è®¢ååæ¶æä½VO */
export interface OrderCancelVO {
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
  /** è¢«åæ¶çè®¢åID */
  orderId?: number;
  /** åæ¶åå  */
  cancelReason?: string;
  /** æ¯å¦æ¯æéæ¬¾ */
  refundable?: boolean;
  /** éæ¬¾éé¢ï¼å¦ææ¯æéæ¬¾ï¼ */
  refundAmount?: string;
  /** åæ¶æ¶é´ */
  cancelTime?: string;
}
