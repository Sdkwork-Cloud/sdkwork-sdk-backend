/** 订单确认操作VO */
export interface OrderConfirmVO {
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
  /** 被确认的订单ID */
  orderId?: number;
  /** 确认时间 */
  confirmTime?: string;
  /** 预计发货时间 */
  estimatedShipTime?: string;
}
