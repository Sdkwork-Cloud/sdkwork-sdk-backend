/** Stripe支付创建订单返回对象 */
export interface StripeObject {
  /** 支付会话ID */
  sessionId?: string;
  /** 支付链接，用于H5跳转支付 */
  paymentUrl?: string;
  /** 客户端密钥，用于前端初始化支付 */
  clientSecret?: string;
  /** 支付意图ID */
  paymentIntentId?: string;
  /** 发布密钥 */
  publishableKey?: string;
  /** 回调URL，用于支付完成后返回 */
  returnUrl?: string;
  /** 交易金额 */
  amount?: string;
  /** 货币代码 */
  currency?: string;
}
