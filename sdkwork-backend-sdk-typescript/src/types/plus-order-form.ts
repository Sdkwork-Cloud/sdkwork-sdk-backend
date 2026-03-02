/** Order creation form */
export interface PlusOrderForm {
  /** 订单类型，PHYSICAL-实物商品，VIRTUAL-虚拟商品，MEMBER-会员购买，POINTS-积分充值 */
  orderType: 'DEFAULT' | 'GOODS' | 'VIRTUAL' | 'MEMBER' | 'POINTS' | 'IM_GROUP';
  /** 用户ID */
  userId: number;
  /** 订单编号，系统生成的唯一订单号，用于业务展示 */
  orderSn?: string;
  /** 第三方支付交易ID，如支付宝、微信支付的交易号 */
  transactionId?: string;
  /** 商户订单号/支付渠道订单号，遵循支付通道标准命名(out_trade_no) */
  outTradeNo?: string;
  /** 订单总金额 */
  totalAmount: number;
  /** 实际支付金额 */
  paidAmount: number;
  /** 订单使用积分数 */
  paidPointsAmount?: number;
  /** 订单状态 */
  status: 'DEFAULT' | 'PENDING' | 'PAID' | 'DELIVERED' | 'COMPLETED' | 'CANCELLED' | 'REFUNDING' | 'PARTIAL_REFUND' | 'FULL_REFUND';
  /** 支付时间 */
  payTime?: string;
  /** 虚拟商品/会员到期时间，仅当orderType为VIRTUAL或MEMBER时有效 */
  expireTime?: string;
  /** 关联内容类型，标识订单关联的业务内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID，标识订单关联的具体业务内容 */
  contentId?: number;
}
