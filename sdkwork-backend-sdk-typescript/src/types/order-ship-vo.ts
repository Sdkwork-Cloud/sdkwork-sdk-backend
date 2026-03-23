/** è®¢ååè´§æä½VO */
export interface OrderShipVO {
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
  /** åè´§çè®¢åID */
  orderId?: number;
  /** å¿«éå¬å¸ */
  shippingCompany?: string;
  /** å¿«éåå· */
  trackingNumber?: string;
  /** åè´§æ¶é´ */
  shipTime?: string;
  /** é¢è®¡å°è¾¾æ¶é´ */
  estimatedArrivalTime?: string;
}
