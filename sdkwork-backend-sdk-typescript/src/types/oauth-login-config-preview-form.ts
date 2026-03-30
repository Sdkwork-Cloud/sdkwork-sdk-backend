/** OAuth login config preview form */
export interface OAuthLoginConfigPreviewForm {
  /** Requested app id, backend fallback resolves with 0 when exact binding is absent */
  appId?: number;
  /** OAuth login scene */
  loginScene: 'APP' | 'BACKEND';
  /** OAuth provider */
  oauthProvider: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
}
