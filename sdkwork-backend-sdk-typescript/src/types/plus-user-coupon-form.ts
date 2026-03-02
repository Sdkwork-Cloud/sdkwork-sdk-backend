/** User coupon creation form */
export interface PlusUserCouponForm {
  /** 用户ID */
  userId: number;
  /** 优惠券模板ID */
  couponId: number;
  /** 用户优惠券的唯一编码 */
  couponCode: string;
  /** 领取时间 */
  acquireAt: string;
  /** 使用时间 */
  useAt?: string;
  /** 使用状态：未使用/已使用/已过期等 */
  status: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
}
