/** è®¢åç¡®è®¤æä½VO */
export interface OrderConfirmVO {
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
  /** è¢«ç¡®è®¤çè®¢åID */
  orderId?: number;
  /** ç¡®è®¤æ¶é´ */
  confirmTime?: string;
  /** é¢è®¡åè´§æ¶é´ */
  estimatedShipTime?: string;
}
