/** 优惠券模板VO，定义优惠券属性 */
export interface PlusCouponVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 优惠券名称 */
  name?: string;
  /** 优惠券类型：满减/折扣/礼品等 */
  type?: 'DEFAULT' | 'CASH' | 'DISCOUNT' | 'GIFT' | 'GROUPON' | 'NORMAL';
  /** 优惠券描述 */
  description?: string;
  /** 抵扣金额（单位：分），若是折扣券可为0 */
  amount?: number;
  /** 折扣率（如 0.8 表示8折） */
  discount?: number;
  /** 满减券使用门槛金额（单位：分） */
  minConsume?: number;
  /** 生效开始时间 */
  startTime?: string;
  /** 生效结束时间 */
  endTime?: string;
  /** 发放总量 */
  total?: number;
  /** 每人领取上限 */
  getLimit?: number;
  /** 优惠券状态：可用/过期/撤销等 */
  status?: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
}
