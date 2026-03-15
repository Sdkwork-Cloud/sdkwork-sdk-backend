/** Point change creation form */
export interface PlusVipPointChangeForm {
  /** User ID */
  userId: number;
  /** Change type */
  changeType: 'DEFAULT' | 'RECHARGE' | 'CONSUME' | 'REWARD' | 'ADJUST' | 'EXPIRE';
  /** Change amount */
  changeAmount: number;
  /** Balance before change */
  beforeBalance: number;
  /** Balance after change */
  afterBalance: number;
  /** Source ID */
  sourceId?: number;
  /** Source type */
  sourceType?: 'DEFAULT' | 'PURCHASE' | 'DAILY_REWARD' | 'COUPON_POINTS_EXCHANGE' | 'COUPON_POINTS_ROLLBACK' | 'SYSTEM' | 'OTHER';
  /** Remark */
  remark?: string;
}
