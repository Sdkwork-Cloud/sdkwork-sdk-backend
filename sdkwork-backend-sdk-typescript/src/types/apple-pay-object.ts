/** Apple Pay支付创建订单返回对象 */
export interface ApplePayObject {
  /** 支付数据，包含加密的支付信息 */
  paymentData?: string;
  /** 商户标识 */
  merchantId?: string;
  /** 交易标识符 */
  transactionId?: string;
  /** 支付方式显示名称 */
  displayName?: string;
  /** 支付网络 */
  network?: string;
  /** 支付类型 */
  type?: string;
  /** 支付金额 */
  amount?: string;
  /** 货币代码 */
  currencyCode?: string;
}
