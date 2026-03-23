/** Order item creation form */
export interface PlusOrderItemForm {
  /** éå® ä»é¨å®î¹éæ¾D */
  orderId: number;
  /** éåæ§ç»«è¯²ç·: PHYSICAL-ç¹çµå¢¿éåæ§, VIRTUAL-éæ°­å«éåæ§, MEMBER-æµ¼æ°¬æ³éå¶å§ */
  productType: 'GOODS' | 'VIRTUAL' | 'SERVICE';
  /** éåæ§ID */
  productId: number;
  /** éåæ§SKU ID */
  skuId: number;
  /** çîæ±éä¼´åº */
  quantity: number;
  /** éåæ§éæç¯ */
  unitPrice: number;
  /** éåæ§é¬è®³ç¯ */
  totalAmount: number;
  /** éæ°­å«éåæ§éå¤æ¥é?æµ å­ç¶productType=VIRTUALéèµæ¹é? */
  expireTime?: string;
  /** C on te nt Ty pe */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** C on te nt Id */
  contentId?: number;
}
