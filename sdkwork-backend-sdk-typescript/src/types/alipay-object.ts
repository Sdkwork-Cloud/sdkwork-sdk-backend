/** æ¯ä»å®æ¯ä»åå»ºè®¢åè¿åå¯¹è±¡ */
export interface AlipayObject {
  /** æ¯ä»é¾æ¥ï¼ç¨äºæ«ç æ¯ä»åè·³è½¬æ¯ä» */
  payUrl?: string;
  /** ç­¾åå­ç¬¦ä¸²ï¼ç¨äºAPPæ¯ä» */
  sign?: string;
  /** åæ·è®¢åå· */
  outTradeNo?: string;
  /** æ¯ä»å®äº¤æå· */
  tradeNo?: string;
  /** åæ·APPID */
  appId?: string;
  /** æ¥å£åç§° */
  method?: string;
  /** ä»ç¨äºäºç»´ç æ¯ä»ï¼äºç»´ç å°å */
  qrCode?: string;
}
