/** OAuth provider account impact binding view object */
export interface OAuthProviderAccountImpactBindingVO {
  /** Binding id */
  bindingId?: number;
  /** App id */
  appId?: number;
  /** App name */
  appName?: string;
  /** Login scene */
  loginScene?: 'APP' | 'BACKEND';
  /** OAuth provider */
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** Binding enabled flag */
  enabled?: boolean;
  /** Priority */
  priority?: number;
  /** Allow auto register */
  allowAutoRegister?: boolean;
  /** Allow bind existing user */
  allowBindExistingUser?: boolean;
}
