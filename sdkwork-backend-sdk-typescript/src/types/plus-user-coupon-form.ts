/** User coupon creation form */
export interface PlusUserCouponForm {
  /** User ID */
  userId: number;
  /** Coupon ID */
  couponId: number;
  /** Coupon code */
  couponCode: string;
  /** Acquire time */
  acquireAt: string;
  /** Acquire request number */
  acquireRequestNo?: string;
  /** Acquire type */
  acquireType?: 'DEFAULT' | 'RECEIVE' | 'REDEEM_CODE' | 'POINTS_EXCHANGE' | 'ADMIN_GRANT';
  /** Point cost */
  pointCost?: number;
  /** Points refunded */
  pointsRefunded?: boolean;
  /** Points refund time */
  pointsRefundAt?: string;
  /** Use time */
  useAt?: string;
  /** Coupon status */
  status: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
}
