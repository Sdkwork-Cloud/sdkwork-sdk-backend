/** Order item creation form */
export interface PlusOrderItemForm {
  /** 关联的订单ID */
  orderId: number;
  /** 商品类型: PHYSICAL-实物商品, VIRTUAL-虚拟商品, MEMBER-会员服务 */
  productType: 'GOODS' | 'VIRTUAL';
  /** 商品ID */
  productId: number;
  /** 商品SKU ID */
  skuId: number;
  /** 购买数量 */
  quantity: number;
  /** 商品单价 */
  unitPrice: number;
  /** 商品总价 */
  totalAmount: number;
  /** 虚拟商品有效期(仅当productType=VIRTUAL时有效) */
  expireTime?: string;
  /** 关联内容类型，标识订单项关联的业务内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID，标识订单项关联的具体业务内容 */
  contentId?: number;
}
