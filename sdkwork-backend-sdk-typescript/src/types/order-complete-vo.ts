/** 订单完成操作VO */
export interface OrderCompleteVO {
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
  /** 完成的订单ID */
  orderId?: number;
  /** 完成时间 */
  completeTime?: string;
  /** 是否已评价 */
  reviewed?: boolean;
  /** 获得积分数量 */
  pointsEarned?: number;
}
