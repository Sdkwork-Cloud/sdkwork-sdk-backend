/** 用户优惠券VO，记录用户持有的优惠券信息 */
export interface PlusUserCouponVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 用户ID */
  userId?: number;
  /** 优惠券模板ID */
  couponId?: number;
  /** 用户优惠券的唯一编码 */
  couponCode?: string;
  /** 领取时间 */
  acquireTime?: string;
  /** 使用时间 */
  useTime?: string;
  /** 使用状态：未使用/已使用/已过期等 */
  status?: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
}
