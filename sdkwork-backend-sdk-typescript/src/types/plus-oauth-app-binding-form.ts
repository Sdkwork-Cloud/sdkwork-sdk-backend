/** OAuth app binding form */
export interface PlusOAuthAppBindingForm {
  /** Application id, backend default binding uses 0 */
  appId?: number;
  /** OAuth login scene */
  loginScene: 'APP' | 'BACKEND';
  /** OAuth provider */
  oauthProvider: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** Mapped channel account id */
  channelAccountId: number;
  /** Enabled status */
  enabled?: boolean;
  /** Priority */
  priority?: number;
  /** Allow auto register */
  allowAutoRegister?: boolean;
  /** Allow bind existing user */
  allowBindExistingUser?: boolean;
  /** Callback uri override */
  callbackUri?: string;
  /** Scope override */
  scope?: string;
  /** Extended config */
  extConfig?: Record<string, Record<string, unknown>>;
  /** Remark */
  remark?: string;
}
