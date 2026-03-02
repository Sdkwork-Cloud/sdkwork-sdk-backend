/** Coupon template creation form */
export interface PlusCouponTemplateForm {
  /** Template name */
  name: string;
  /** Template code */
  templateCode?: string;
  /** Coupon type (enum) */
  type: 'DEFAULT' | 'CASH' | 'DISCOUNT' | 'GIFT' | 'GROUPON' | 'NORMAL';
  /** Description */
  description?: string;
  /** Discount amount (in cents) */
  amount?: number;
  /** Discount rate */
  discount?: number;
  /** Minimum consume amount (in cents) */
  minConsume?: number;
  /** Start time */
  startTime?: string;
  /** End time */
  endTime?: string;
  /** Total quantity */
  total?: number;
  /** Get limit per user */
  getLimit?: number;
  /** Coupon status */
  status?: 'DEFAULT' | 'UNUSED' | 'USED' | 'EXPIRED' | 'INACTIVE';
  /** Validity type */
  validityType?: 'DEFAULT' | 'FIXED' | 'DAYS_AFTER_RECEIVE' | 'DAYS_AFTER_ACTIVATION';
  /** Validity days */
  validityDays?: number;
  /** Can share */
  canShare?: boolean;
  /** Scope type */
  scopeType?: number;
  /** Scope value */
  scopeValue?: string;
}
