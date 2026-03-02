/** 退款记录VO，记录所有退款交易信息，支持多种退款场景 */
export interface PlusRefundVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 关联的订单ID */
  orderId?: number;
  /** 关联的支付记录ID，用于追溯原始支付交易 */
  paymentId?: number;
  /** 商户退款单号(out_refund_no)，系统生成的唯一退款单号，用于业务展示 */
  outRefundNo?: string;
  /** 商户订单号/支付渠道订单号，遵循支付通道标准命名(out_trade_no) */
  outTradeNo?: string;
  /** 支付渠道退款流水号，支付渠道返回的退款交易号 */
  refundId?: string;
  /** 退款金额 */
  amount?: number;
  /** 退款类型，RETURN-退货退款，CANCEL-订单取消，OVERPAY-多付款项，OTHER-其他原因 */
  type?: 'RETURN' | 'CANCEL' | 'OVERPAY' | 'OTHER';
  /** 退款状态，PENDING-待处理，PROCESSING-处理中，SUCCESS-退款成功，FAILED-退款失败 */
  status?: 'DEFAULT' | 'PENDING' | 'SUCCESS' | 'FAILED' | 'REJECTED' | 'CANCELLED';
  /** 退款申请时间 */
  applyTime?: string;
  /** 退款完成时间 */
  completeTime?: string;
  /** 退款备注信息 */
  remark?: string;
  /** 关联内容类型，标识退款记录关联的业务内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID，标识退款记录关联的具体业务内容 */
  contentId?: number;
}
