/** è®¢åé¡¹Value Objectï¼æ¯æå¤ç§ååç±»åï¼1.å®ç©åå 2.èæåå(å¦çµå­ä¹¦ãè¯¾ç¨ç­) 3.ä¼åæå¡ */
export interface PlusOrderItemVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å³èçè®¢åID */
  orderId?: number;
  /** ååç±»åï¼PHYSICAL-å®ç©ååï¼VIRTUAL-èæååï¼MEMBER-ä¼åæå¡ */
  productType?: 'GOODS' | 'VIRTUAL' | 'SERVICE';
  /** ååID */
  productId?: number;
  /** ååSKU ID */
  skuId?: number;
  /** è´­ä¹°æ°é */
  quantity?: number;
  /** åååä»· */
  unitPrice?: number;
  /** ååæ»ä»· */
  totalAmount?: number;
  /** èæååæææ(ä»å½productType=VIRTUALæ¶ææ)ï¼å¦çµå­ä¹¦ãè¯¾ç¨ç­çä½¿ç¨æé */
  expireTime?: string;
  /** å³èåå®¹ç±»åï¼æ è¯è®¢åé¡¹å³èçä¸å¡åå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èåå®¹IDï¼æ è¯è®¢åé¡¹å³èçå·ä½ä¸å¡åå®¹ */
  contentId?: number;
}
