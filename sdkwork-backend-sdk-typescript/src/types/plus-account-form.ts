/** Account creation form */
export interface PlusAccountForm {
  /** Account type */
  accountType: 'DEFAULT' | 'CASH' | 'POINTS' | 'TOKEN';
  /** User ID */
  userId: number;
  /** Available balance */
  availableBalance?: number;
  /** Frozen balance */
  frozenBalance?: number;
  /** Available points */
  availablePoints?: number;
  /** Frozen points */
  frozenPoints?: number;
  /** Account status */
  status: 'DEFAULT' | 'ACTIVE' | 'FROZEN' | 'CLOSED';
}
