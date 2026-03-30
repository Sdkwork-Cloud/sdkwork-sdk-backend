/** 微信支付创建订单返回对象 */
export interface WechatPayObject {
  /** 预支付交易会话标识，用于小程序端发起支付 */
  prepayId?: string;
  /** 支付跳转链接，用于H5支付 */
  mwebUrl?: string;
  /** 二维码链接，用于扫码支付 */
  codeUrl?: string;
  /** 时间戳，用于签名 */
  timeStamp?: string;
  /** 随机字符串，用于签名 */
  nonceStr?: string;
  /** 签名类型，默认为MD5，支持HMAC-SHA256 */
  signType?: string;
  /** 签名，用于客户端验证 */
  paySign?: string;
  /** 商户订单号 */
  outTradeNo?: string;
  /** 交易类型，小程序取值为JSAPI，扫码支付取值为NATIVE，H5支付取值为MWEB */
  tradeType?: string;
}
