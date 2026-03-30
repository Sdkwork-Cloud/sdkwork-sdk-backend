/** 订单关闭操作VO */
export interface OrderCloseVO {
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
  /** 关闭的订单ID */
  orderId?: number;
  /** 关闭原因 */
  closeReason?: string;
  /** 关闭时间 */
  closeTime?: string;
  /** 是否可重新打开 */
  reopenable?: boolean;
}
