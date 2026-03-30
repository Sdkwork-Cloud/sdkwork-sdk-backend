/** VIP level creation form */
export interface PlusVipLevelForm {
  /** VIP level name */
  name: string;
  /** VIP level value */
  levelValue: number;
  /** Required points */
  requiredPoints: number;
  /** VIP level description */
  description?: string;
  /** VIP level status */
  status?: 'ENABLED' | 'DISABLED';
}
