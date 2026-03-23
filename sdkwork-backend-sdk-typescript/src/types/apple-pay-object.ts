/** Apple Payæ¯ä»åå»ºè®¢åè¿åå¯¹è±¡ */
export interface ApplePayObject {
  /** æ¯ä»æ°æ®ï¼åå«å å¯çæ¯ä»ä¿¡æ¯ */
  paymentData?: string;
  /** åæ·æ è¯ */
  merchantId?: string;
  /** äº¤ææ è¯ç¬¦ */
  transactionId?: string;
  /** æ¯ä»æ¹å¼æ¾ç¤ºåç§° */
  displayName?: string;
  /** æ¯ä»ç½ç» */
  network?: string;
  /** æ¯ä»ç±»å */
  type?: string;
  /** æ¯ä»éé¢ */
  amount?: string;
  /** è´§å¸ä»£ç  */
  currencyCode?: string;
}
