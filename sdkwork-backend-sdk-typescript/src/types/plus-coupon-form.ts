/** Coupon template creation form */
export interface PlusCouponForm {
  /** Coupon name */
  name: string;
  /** Redeem code */
  redeemCode?: string;
  /** Point cost */
  pointCost?: number;
  /** Coupon type */
  type: 'DEFAULT' | 'CASH' | 'DISCOUNT' | 'GIFT' | 'GROUPON' | 'NORMAL' | 'POINTS_EXCHANGE';
  /** Description */
  description?: string;
  /** Fixed amount */
  amount?: number;
  /** Discount rate */
  discount?: number;
  /** Minimum consume amount */
  minConsume?: number;
  /** Start time */
  startTime: string;
  /** End time */
  endTime: string;
  /** Total quantity */
  total: number;
  /** Per-user limit */
  getLimit: number;
  /** Coupon status */
  status: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
  /** Scope type */
  scopeType: 'DEFAULT' | 'ALL' | 'VIP_ONLY' | 'CUSTOM';
  /** Scope value */
  scopeValue?: string;
}
