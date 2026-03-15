/** Payment cancel form */
export interface PlusPaymentCancelForm {
  /** Payment ID */
  paymentId: number;
  /** External trade number */
  outTradeNo?: string;
  /** Payment amount */
  amount: number;
  /** Cancel reason */
  reason?: string;
}
