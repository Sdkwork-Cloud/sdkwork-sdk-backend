/** 微信公众号JS-SDK配置 */
export interface OfficialAccountSdkConfigVO {
  /** 开启调试模式 */
  debug?: boolean;
  /** 服务号的唯一标识 */
  appId?: string;
  /** 生成签名的时间戳 */
  timestamp?: string;
  /** 生成签名的随机串 */
  nonceStr?: string;
  /** 签名 */
  signature?: string;
  /** 需要使用的JS接口列表 */
  jsApiList?: string[];
}
