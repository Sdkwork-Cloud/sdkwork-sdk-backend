/** Account history creation form */
export interface PlusAccountHistoryForm {
  /** Account type */
  accountType: 'DEFAULT' | 'CASH' | 'POINTS' | 'TOKEN';
  /** Asset type */
  assetType: 'DEFAULT' | 'BALANCE' | 'POINT' | 'TOKEN';
  /** Account ID */
  accountId: number;
  /** Transaction ID */
  transactionId: string;
  /** Transaction type */
  transactionType: 'DEFAULT' | 'DEPOSIT' | 'WITHDRAW' | 'REFUND' | 'TRANSFER' | 'ADJUST' | 'INCOME' | 'FROZEN' | 'UNFROZEN' | 'DEDUCT' | 'RECHARGE' | 'CONSUME' | 'POINT_EARN' | 'POINT_USE' | 'POINT_EXPIRE' | 'POINT_TRANSFER' | 'POINT_ADJUST' | 'POINT_REFUND' | 'POINT_FROZEN' | 'POINT_UNFROZEN' | 'TOKEN_DEPOSIT' | 'TOKEN_USE' | 'TOKEN_REFUND' | 'TOKEN_FROZEN' | 'TOKEN_UNFROZEN' | 'TOKEN_TRANSFER' | 'TOKEN_ADJUST' | 'TOKEN_EXPIRE' | 'SYSTEM_ADJUST' | 'OTHER';
  /** Transaction status */
  status: 'DEFAULT' | 'PROCESSING' | 'SUCCESS' | 'FAILED' | 'CANCELLED';
  /** Amount */
  amount?: number;
  /** Balance before */
  balanceBefore?: number;
  /** Balance after */
  balanceAfter?: number;
  /** Related account ID */
  relatedAccountId?: number;
  /** Points change */
  pointsChange?: number;
  /** Points before */
  pointsBefore?: number;
  /** Points after */
  pointsAfter?: number;
  /** Source type */
  sourceType?: 'DEFAULT' | 'ORDER' | 'ACTIVITY' | 'SIGN_IN' | 'SHARE' | 'INVITE' | 'SYSTEM' | 'OTHER';
  /** Source business ID */
  sourceId?: string;
  /** Expired at */
  expiredAt?: string;
  /** Remarks */
  remarks?: string;
}
