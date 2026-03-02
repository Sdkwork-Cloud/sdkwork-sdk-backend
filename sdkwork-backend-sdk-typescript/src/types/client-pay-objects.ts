import type { AlipayObject } from './alipay-object';
import type { ApplePayObject } from './apple-pay-object';
import type { PaypalObject } from './paypal-object';
import type { StripeObject } from './stripe-object';
import type { UnionPayObject } from './union-pay-object';
import type { WechatPayObject } from './wechat-pay-object';

/** Client Payment Objects Container */
export interface ClientPayObjects {
  /** WeChat Pay payment object */
  wechat?: WechatPayObject;
  /** Alipay payment object */
  alipay?: AlipayObject;
  /** Apple Pay payment object */
  applePay?: ApplePayObject;
  /** PayPal payment object */
  paypal?: PaypalObject;
  /** Stripe payment object */
  stripe?: StripeObject;
  /** UnionPay payment object */
  unionPay?: UnionPayObject;
}
