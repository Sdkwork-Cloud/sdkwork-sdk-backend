/** VIP benefit creation form */
export interface PlusVipBenefitForm {
  /** Benefit name */
  name: string;
  /** Benefit description */
  description?: string;
  /** Benefit key */
  benefitKey: string;
  /** Benefit type */
  type: 'DEFAULT' | 'MONTHLY_FREE_POINTS' | 'DEDICATED_SUPPORT' | 'PURCHASE_DISCOUNT' | 'EXCLUSIVE_CONTENT' | 'PRIORITY_SERVICE' | 'BIRTHDAY_GIFT';
  /** Benefit status */
  status?: 'ENABLED' | 'DISABLED';
}
