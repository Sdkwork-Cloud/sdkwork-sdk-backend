/** VIP benefit usage creation form */
export interface PlusVipBenefitUsageForm {
  /** User ID */
  userId: number;
  /** Benefit type */
  benefitType: 'DEFAULT' | 'MONTHLY_FREE_POINTS' | 'DEDICATED_SUPPORT' | 'PURCHASE_DISCOUNT' | 'EXCLUSIVE_CONTENT' | 'PRIORITY_SERVICE' | 'BIRTHDAY_GIFT';
  /** Usage time */
  usageTime: string;
  /** Usage count */
  usageCount: number;
  /** Usage status: 1-active, 2-revoked */
  status: number;
  /** Source record ID */
  sourceId?: number;
  /** Source type */
  sourceType?: string;
  /** Remark */
  remark?: string;
}
