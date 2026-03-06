/** 订单内容项 */
export interface OrderContentItem {
  /** 内容ID */
  id?: number;
  /** 商品ID */
  productId?: number;
  /** SKU ID */
  skuId?: number;
  /** 内容名称 */
  name?: string;
  /** 内容类型 */
  type?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 数量 */
  quantity?: number;
  /** 单价 */
  unitPrice?: number;
  /** 总价 */
  totalPrice?: number;
}
