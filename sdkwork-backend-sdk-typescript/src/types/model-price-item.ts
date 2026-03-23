/** æ¨¡åå®ä»·å·ä½æ¡ç®ï¼åå«ä»·æ ¼ç±»ååå¯¹åºä»·æ ¼æ°å¼ï¼ */
export interface ModelPriceItem {
  /** ä»·æ ¼ç±»åï¼è¾å¥/è¾åº/æ¹éå¤çç­ï¼ */
  type?: 'INPUT' | 'BATCH_INPUT' | 'CACHED_INPUT' | 'BATCH_CACHED_INPUT' | 'OUTPUT' | 'BATCH_OUTPUT' | 'COUNT' | 'DURATION';
  /** ä»·æ ¼æ°å¼ï¼åä½ç±ä»·æ ¼è®¡éåä½å³å®ï¼ */
  price?: number;
}
