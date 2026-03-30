/** OAuth provider account form */
export interface OAuthProviderAccountForm {
  /** Provider account display name */
  name: string;
  /** OAuth provider */
  oauthProvider: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** OAuth client product, defaults to oauth */
  product?: string;
  /** OAuth client id */
  clientId: string;
  /** OAuth app secret or client secret */
  appSecret?: string;
  /** OAuth token */
  token?: string;
  /** OAuth encoding AES key */
  encodingAESKey?: string;
  /** Default redirect uri */
  redirectUri?: string;
  /** Default OAuth scope */
  scope?: string;
  /** Account status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Description */
  description?: string;
}
