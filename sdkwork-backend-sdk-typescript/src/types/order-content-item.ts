/** Order content item */
export interface OrderContentItem {
  /** Content ID */
  id?: number;
  /** Product ID */
  productId?: number;
  /** SKU ID */
  skuId?: number;
  /** Content name */
  name?: string;
  /** Content type */
  type?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Quantity */
  quantity?: number;
  /** Unit price */
  unitPrice?: number;
  /** Total price */
  totalPrice?: number;
}
