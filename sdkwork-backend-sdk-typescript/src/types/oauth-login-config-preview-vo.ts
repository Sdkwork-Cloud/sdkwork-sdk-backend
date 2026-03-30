/** OAuth login config preview view object */
export interface OAuthLoginConfigPreviewVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  resolved?: boolean;
  message?: string;
  fallbackUsed?: boolean;
  requestedAppId?: number;
  resolvedAppId?: number;
  loginScene?: 'APP' | 'BACKEND';
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  bindingId?: number;
  bindingEnabled?: boolean;
  channelAccountId?: number;
  channelAccountName?: string;
  channelAccountStatus?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  providerClientId?: string;
  effectiveCallbackUri?: string;
  effectiveCallbackSource?: string;
  effectiveScope?: string;
  effectiveScopeSource?: string;
  allowAutoRegister?: boolean;
  allowBindExistingUser?: boolean;
}
