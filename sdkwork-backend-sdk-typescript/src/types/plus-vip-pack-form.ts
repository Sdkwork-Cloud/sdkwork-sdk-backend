/** VIP package creation form */
export interface PlusVipPackForm {
  /** Package name */
  name: string;
  /** Package description */
  description?: string;
  /** Package group ID */
  groupId: number;
  /** VIP level ID */
  vipLevelId: number;
  /** Price */
  price: number;
  /** Point amount */
  pointAmount: number;
  /** VIP duration in days */
  vipDurationDays: number;
  /** Package status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE';
  /** Sort weight */
  sortWeight?: number;
  /** Valid from */
  validFrom?: string;
  /** Valid to */
  validTo?: string;
  /** Remark */
  remark?: string;
}
