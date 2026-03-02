/** OAuth callback form */
export interface OAuthCallbackForm {
  /** OAuth提供商类型 */
  provider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** 授权码 */
  code?: string;
  /** 状态参数，用于验证请求一致性 */
  state?: string;
}
