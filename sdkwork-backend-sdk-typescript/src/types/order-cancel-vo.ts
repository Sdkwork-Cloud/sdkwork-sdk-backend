/** 订单取消操作VO */
export interface OrderCancelVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 操作是否成功 */
  success?: boolean;
  /** 操作结果消息 */
  message?: string;
  /** 操作时间 */
  operationTime?: string;
  /** 被取消的订单ID */
  orderId?: number;
  /** 取消原因 */
  cancelReason?: string;
  /** 是否支持退款 */
  refundable?: boolean;
  /** 退款金额（如果支持退款） */
  refundAmount?: string;
  /** 取消时间 */
  cancelTime?: string;
}
