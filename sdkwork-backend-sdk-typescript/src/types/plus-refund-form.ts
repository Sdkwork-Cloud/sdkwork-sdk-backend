/** Refund form */
export interface PlusRefundForm {
  /** Order ID */
  orderId: number;
  /** Payment ID */
  paymentId: number;
  /** External refund number */
  outRefundNo: string;
  /** External trade number */
  outTradeNo?: string;
  /** Refund transaction ID */
  refundId?: string;
  /** Refund amount */
  amount: number;
  /** Refund type */
  type: 'RETURN' | 'CANCEL' | 'OVERPAY' | 'OTHER';
  /** Refund status */
  status: 'DEFAULT' | 'PENDING' | 'SUCCESS' | 'FAILED' | 'REJECTED' | 'CANCELLED';
  /** Application time */
  applyTime: string;
  /** Completion time */
  completeTime?: string;
  /** Remark */
  remark?: string;
  /** Content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** Content ID */
  contentId?: number;
}
