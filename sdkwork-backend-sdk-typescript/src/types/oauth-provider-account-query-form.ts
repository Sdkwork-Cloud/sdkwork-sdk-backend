/** OAuth provider account query form */
export interface OAuthProviderAccountQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** OAuth provider filter */
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  /** Status filter */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Keyword filter */
  keyword?: string;
}
