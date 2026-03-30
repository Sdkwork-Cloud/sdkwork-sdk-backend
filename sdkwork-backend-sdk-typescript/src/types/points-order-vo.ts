/** 积分充值订单VO */
export interface PointsOrderVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 订单ID */
  orderId?: number;
  /** 订单编号 */
  orderSn?: string;
  /** 是否创建成功 */
  success?: boolean;
  /** 消息 */
  message?: string;
}
