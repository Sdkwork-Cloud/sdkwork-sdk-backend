/** 银联支付创建订单返回对象 */
export interface UnionPayObject {
  /** 支付跳转链接，用于H5支付 */
  payUrl?: string;
  /** 交易流水号，用于APP支付 */
  tn?: string;
  /** 商户订单号 */
  merOrderId?: string;
  /** 商户代码 */
  merId?: string;
  /** 环境标识，00表示正式环境，01表示测试环境 */
  mode?: string;
  /** 商户自定义协议，用于APP支付后返回 */
  schemeStr?: string;
  /** 签名信息 */
  signature?: string;
}
