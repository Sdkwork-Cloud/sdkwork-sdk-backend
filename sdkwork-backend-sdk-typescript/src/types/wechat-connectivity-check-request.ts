export interface WechatConnectivityCheckRequest {
  /** Official account appId */
  appId?: string;
  /** Official account appSecret */
  appSecret?: string;
  /** Server callback URL */
  serverUrl?: string;
  /** Token configured in WeChat platform */
  token?: string;
  /** Encoding AES key configured in WeChat platform */
  encodingAESKey?: string;
}
