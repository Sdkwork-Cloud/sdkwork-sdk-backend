/** éæ¬¾è®°å½VOï¼è®°å½ææéæ¬¾äº¤æä¿¡æ¯ï¼æ¯æå¤ç§éæ¬¾åºæ¯ */
export interface PlusRefundVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å³èçè®¢åID */
  orderId?: number;
  /** å³èçæ¯ä»è®°å½IDï¼ç¨äºè¿½æº¯åå§æ¯ä»äº¤æ */
  paymentId?: number;
  /** åæ·éæ¬¾åå·(out_refund_no)ï¼ç³»ç»çæçå¯ä¸éæ¬¾åå·ï¼ç¨äºä¸å¡å±ç¤º */
  outRefundNo?: string;
  /** åæ·è®¢åå·/æ¯ä»æ¸ éè®¢åå·ï¼éµå¾ªæ¯ä»ééæ åå½å(out_trade_no) */
  outTradeNo?: string;
  /** æ¯ä»æ¸ ééæ¬¾æµæ°´å·ï¼æ¯ä»æ¸ éè¿åçéæ¬¾äº¤æå· */
  refundId?: string;
  /** éæ¬¾éé¢ */
  amount?: number;
  /** éæ¬¾ç±»åï¼RETURN-éè´§éæ¬¾ï¼CANCEL-è®¢ååæ¶ï¼OVERPAY-å¤ä»æ¬¾é¡¹ï¼OTHER-å¶ä»åå  */
  type?: 'RETURN' | 'CANCEL' | 'OVERPAY' | 'OTHER';
  /** éæ¬¾ç¶æï¼PENDING-å¾å¤çï¼PROCESSING-å¤çä¸­ï¼SUCCESS-éæ¬¾æåï¼FAILED-éæ¬¾å¤±è´¥ */
  status?: 'DEFAULT' | 'PENDING' | 'SUCCESS' | 'FAILED' | 'REJECTED' | 'CANCELLED';
  /** éæ¬¾ç³è¯·æ¶é´ */
  applyTime?: string;
  /** éæ¬¾å®ææ¶é´ */
  completeTime?: string;
  /** éæ¬¾å¤æ³¨ä¿¡æ¯ */
  remark?: string;
  /** å³èåå®¹ç±»åï¼æ è¯éæ¬¾è®°å½å³èçä¸å¡åå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èåå®¹IDï¼æ è¯éæ¬¾è®°å½å³èçå·ä½ä¸å¡åå®¹ */
  contentId?: number;
}
