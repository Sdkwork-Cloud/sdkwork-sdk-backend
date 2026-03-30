/** 支付宝支付创建订单返回对象 */
export interface AlipayObject {
  /** 支付链接，用于扫码支付和跳转支付 */
  payUrl?: string;
  /** 签名字符串，用于APP支付 */
  sign?: string;
  /** 商户订单号 */
  outTradeNo?: string;
  /** 支付宝交易号 */
  tradeNo?: string;
  /** 商户APPID */
  appId?: string;
  /** 接口名称 */
  method?: string;
  /** 仅用于二维码支付，二维码地址 */
  qrCode?: string;
}
