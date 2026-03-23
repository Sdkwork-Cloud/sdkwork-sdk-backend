/** Payment status query form */
export interface PlusPaymentStatusQueryForm {
  /** åæ·è®¢åå·/æ¯ä»æ¸ éè®¢åå· */
  outTradeNo?: string;
  /** æ¯ä»æ¸ é: ALIPAY-æ¯ä»å®, WECHAT-å¾®ä¿¡æ¯ä», UNIONPAY-é¶èæ¯ä», BALANCE-ä½é¢æ¯ä» */
  provider?: 'WECHAT_PAY' | 'ALIPAY' | 'UNION_PAY' | 'APPLE_PAY' | 'GOOGLE_PAY' | 'PAYPAL' | 'STRIPE' | 'AMAZON_PAY' | 'VISA' | 'MASTERCARD' | 'AMERICAN_EXPRESS' | 'DISCOVER' | 'JCB' | 'DINERS_CLUB' | 'BANK_TRANSFER' | 'CASH' | 'CREDIT_CARD' | 'DEBIT_CARD';
  /** æ¯ä»éé¢ */
  amount?: number;
}
