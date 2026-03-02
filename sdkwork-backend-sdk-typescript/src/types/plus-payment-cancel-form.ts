/** Payment cancel form */
export interface PlusPaymentCancelForm {
  /** 支付记录ID */
  paymentId: number;
  /** 商户订单号/支付渠道订单号 */
  outTradeNo: string;
  /** 支付金额 */
  amount: number;
  /** 取消原因 */
  reason?: string;
}
