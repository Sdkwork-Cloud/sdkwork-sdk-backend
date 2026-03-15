/** Order item creation form */
export interface PlusOrderItemForm {
  /** 鍏宠仈鐨勮鍗旾D */
  orderId: number;
  /** 鍟嗗搧绫诲瀷: PHYSICAL-瀹炵墿鍟嗗搧, VIRTUAL-铏氭嫙鍟嗗搧, MEMBER-浼氬憳鏈嶅姟 */
  productType: 'GOODS' | 'VIRTUAL' | 'SERVICE';
  /** 鍟嗗搧ID */
  productId: number;
  /** 鍟嗗搧SKU ID */
  skuId: number;
  /** 璐拱鏁伴噺 */
  quantity: number;
  /** 鍟嗗搧鍗曚环 */
  unitPrice: number;
  /** 鍟嗗搧鎬讳环 */
  totalAmount: number;
  /** 铏氭嫙鍟嗗搧鏈夋晥鏈?浠呭綋productType=VIRTUAL鏃舵湁鏁? */
  expireTime?: string;
  /** C on te nt Ty pe */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** C on te nt Id */
  contentId?: number;
}
