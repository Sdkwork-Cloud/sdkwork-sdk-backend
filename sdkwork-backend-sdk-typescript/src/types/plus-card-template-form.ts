/** Card template creation form */
export interface PlusCardTemplateForm {
  /** Template name */
  name?: string;
  /** Template code */
  templateCode?: string;
  /** Card type (enum) */
  cardType: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  /** Code type (enum) */
  codeType?: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  /** Title */
  title?: string;
  /** Description */
  description?: string;
  /** Brand name */
  brandName?: string;
  /** Logo URL */
  logoUrl?: string;
  /** Notice */
  notice?: string;
  /** Color */
  color?: string;
  /** Quantity */
  quantity?: number;
  /** Get limit */
  getLimit?: number;
  /** Can share */
  canShare?: boolean;
  /** Can give friend */
  canGiveFriend?: boolean;
  /** Minimum balance */
  minimumBalance?: number;
  /** Initial balance */
  initialBalance?: number;
  /** Discount rate */
  discountRate?: number;
  /** Validity type */
  validityType: 'DEFAULT' | 'FIXED' | 'DAYS_AFTER_RECEIVE' | 'DAYS_AFTER_ACTIVATION';
  /** Start time */
  startTime?: string;
  /** End time */
  endTime?: string;
  /** Validity days */
  validityDays?: number;
  /** Is deleted */
  isDeleted?: boolean;
}
