/** PayPal支付创建订单返回对象 */
export interface PaypalObject {
  /** 支付令牌，用于后续支付操作 */
  token?: string;
  /** 支付人ID */
  payerId?: string;
  /** 支付链接，用于跳转到PayPal支付页面 */
  paymentUrl?: string;
  /** 商户订单号 */
  invoice?: string;
  /** 支付金额 */
  amount?: string;
  /** 货币代码 */
  currency?: string;
  /** 支付状态 */
  paymentStatus?: string;
  /** 交易号 */
  transactionId?: string;
  /** 返回URL */
  returnUrl?: string;
  /** 取消URL */
  cancelUrl?: string;
}
