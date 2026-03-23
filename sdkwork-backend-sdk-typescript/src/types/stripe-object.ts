/** Stripeæ¯ä»åå»ºè®¢åè¿åå¯¹è±¡ */
export interface StripeObject {
  /** æ¯ä»ä¼è¯ID */
  sessionId?: string;
  /** æ¯ä»é¾æ¥ï¼ç¨äºH5è·³è½¬æ¯ä» */
  paymentUrl?: string;
  /** å®¢æ·ç«¯å¯é¥ï¼ç¨äºåç«¯åå§åæ¯ä» */
  clientSecret?: string;
  /** æ¯ä»æå¾ID */
  paymentIntentId?: string;
  /** åå¸å¯é¥ */
  publishableKey?: string;
  /** åè°URLï¼ç¨äºæ¯ä»å®æåè¿å */
  returnUrl?: string;
  /** äº¤æéé¢ */
  amount?: string;
  /** è´§å¸ä»£ç  */
  currency?: string;
}
