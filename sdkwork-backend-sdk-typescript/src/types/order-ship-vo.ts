/** 订单发货操作VO */
export interface OrderShipVO {
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
  /** 发货的订单ID */
  orderId?: number;
  /** 快递公司 */
  shippingCompany?: string;
  /** 快递单号 */
  trackingNumber?: string;
  /** 发货时间 */
  shipTime?: string;
  /** 预计到达时间 */
  estimatedArrivalTime?: string;
}
