/** PayPalæ¯ä»åå»ºè®¢åè¿åå¯¹è±¡ */
export interface PaypalObject {
  /** æ¯ä»ä»¤çï¼ç¨äºåç»­æ¯ä»æä½ */
  token?: string;
  /** æ¯ä»äººID */
  payerId?: string;
  /** æ¯ä»é¾æ¥ï¼ç¨äºè·³è½¬å°PayPalæ¯ä»é¡µé¢ */
  paymentUrl?: string;
  /** åæ·è®¢åå· */
  invoice?: string;
  /** æ¯ä»éé¢ */
  amount?: string;
  /** è´§å¸ä»£ç  */
  currency?: string;
  /** æ¯ä»ç¶æ */
  paymentStatus?: string;
  /** äº¤æå· */
  transactionId?: string;
  /** è¿åURL */
  returnUrl?: string;
  /** åæ¶URL */
  cancelUrl?: string;
}
