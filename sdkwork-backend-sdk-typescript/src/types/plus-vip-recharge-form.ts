/** Recharge record creation form */
export interface PlusVipRechargeForm {
  /** User ID */
  userId: number;
  /** VIP level ID */
  vipLevelId?: number;
  /** Recharge amount */
  amount: number;
  /** Point amount */
  pointAmount: number;
  /** Recharge type */
  rechargeType: 'DEFAULT' | 'DIRECT' | 'PACKAGE' | 'PROMOTION' | 'GIFT';
  /** Recharge time */
  rechargeTime: string;
  /** Transaction number */
  transactionNo?: string;
  /** Status */
  status: number;
  /** Remark */
  remark?: string;
}
