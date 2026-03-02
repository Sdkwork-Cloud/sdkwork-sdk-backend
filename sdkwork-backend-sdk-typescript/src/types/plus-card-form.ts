/** Membership card creation form */
export interface PlusCardForm {
  /** Card organization ID */
  cardOrganizationId: number;
  /** Card type: membership card, gift card, etc. */
  cardType: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  /** Coupon code type: QR code, barcode, etc. */
  codeType: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  /** Card title */
  title: string;
  /** Merchant name */
  brandName: string;
  /** Card logo image URL */
  logoUrl?: string;
  /** Usage instructions */
  notice?: string;
  /** Card details description */
  description?: string;
  /** Card color */
  color?: string;
  /** Card inventory/issuance quantity */
  quantity?: number;
  /** Per person collection limit */
  getLimit?: number;
  /** Whether can be shared */
  canShare?: boolean;
  /** Whether can be given to friends */
  canGiveFriend?: boolean;
  /** Effective time */
  startTime: string;
  /** Expiration time */
  endTime: string;
  /** Card status: enabled/disabled/deleted */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
