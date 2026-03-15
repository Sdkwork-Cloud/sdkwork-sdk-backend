/** VIP user creation form */
export interface PlusVipUserForm {
  /** User ID */
  userId: number;
  /** VIP level ID */
  vipLevelId?: number;
  /** VIP status */
  status: 'DEFAULT' | 'ACTIVE' | 'EXPIRED' | 'FROZEN' | 'CANCELLED';
  /** Point balance */
  pointBalance: number;
  /** Total recharged points */
  totalRechargedPoints: number;
  /** Valid from */
  validFrom?: string;
  /** Valid to */
  validTo?: string;
  /** Last active time */
  lastActiveTime?: string;
  /** Remark */
  remark?: string;
}
