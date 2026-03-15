/** VIP recharge package creation form */
export interface PlusVipRechargePackForm {
  /** Package name */
  name: string;
  /** Package description */
  description?: string;
  /** Package price */
  price: number;
  /** Bonus points */
  pointAmount: number;
  /** VIP duration in days */
  vipDurationDays?: number;
  /** Package status */
  status: number;
  /** Sort weight */
  sortWeight?: number;
  /** Validity start time */
  validFrom?: string;
  /** Validity end time */
  validTo?: string;
  /** Remarks */
  remark?: string;
}
