/** OAuth app binding query form */
export interface PlusOAuthAppBindingQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** Application id */
  appId?: number;
  /** OAuth login scene */
  loginScene?: 'APP' | 'BACKEND';
  /** OAuth provider */
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** Channel account id */
  channelAccountId?: number;
  /** Enabled status */
  enabled?: boolean;
}
