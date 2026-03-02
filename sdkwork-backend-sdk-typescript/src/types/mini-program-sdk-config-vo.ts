/** 微信小程序SDK配置 */
export interface MiniProgramSdkConfigVO {
  /** 小程序的AppID */
  appId?: string;
  /** 生成签名的时间戳 */
  timestamp?: number;
  /** 生成签名的随机串 */
  nonceStr?: string;
  /** 签名 */
  signature?: string;
  /** 需要使用的JS接口列表 */
  jsApiList?: string[];
}
