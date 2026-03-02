/** User-card binding creation form */
export interface PlusUserCardForm {
  /** User ID (reference to plus_user table) */
  userId: number;
  /** Card ID (reference to plus_card table) */
  cardId: number;
  /** User membership card number/Code */
  cardCode: string;
  /** Acquisition time */
  acquireTime: string;
  /** Activation time */
  activateTime?: string;
  /** Cancellation/expiration time */
  cancelTime?: string;
  /** Current points balance */
  points?: number;
  /** Current stored value balance */
  balance?: number;
}
