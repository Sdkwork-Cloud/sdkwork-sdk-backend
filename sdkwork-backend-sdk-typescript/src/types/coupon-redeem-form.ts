/** 优惠券兑换请求 */
export interface CouponRedeemForm {
  /** 兑换码 */
  redeemCode: string;
  /** 兑换渠道 */
  channel?: string;
}
