/** Payment status query form */
export interface PlusPaymentStatusQueryForm {
  /** 商户订单号/支付渠道订单号 */
  outTradeNo?: string;
  /** 支付渠道: ALIPAY-支付宝, WECHAT-微信支付, UNIONPAY-银联支付, BALANCE-余额支付 */
  provider?: 'WECHAT_PAY' | 'ALIPAY' | 'UNION_PAY' | 'APPLE_PAY' | 'GOOGLE_PAY' | 'PAYPAL' | 'STRIPE' | 'AMAZON_PAY' | 'VISA' | 'MASTERCARD' | 'AMERICAN_EXPRESS' | 'DISCOVER' | 'JCB' | 'DINERS_CLUB' | 'BANK_TRANSFER' | 'CASH' | 'CREDIT_CARD' | 'DEBIT_CARD';
  /** 支付金额 */
  amount?: number;
}
