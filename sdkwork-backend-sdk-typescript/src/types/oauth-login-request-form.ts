/** OAuth login request form */
export interface OAuthLoginRequestForm {
  /** OAuth提供商类型 */
  provider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** 回调URL */
  redirectUri?: string;
  /** 授权范围 */
  scope?: string;
  /** 状态参数，用于防止CSRF攻击 */
  state?: string;
}
