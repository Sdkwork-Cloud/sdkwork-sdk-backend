/** OAuth app binding view object */
export interface PlusOAuthAppBindingVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  id?: number;
  uuid?: string;
  appId?: number;
  loginScene?: 'APP' | 'BACKEND';
  oauthProvider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE' | 'DOUYIN';
  channelAccountId?: number;
  enabled?: boolean;
  priority?: number;
  allowAutoRegister?: boolean;
  allowBindExistingUser?: boolean;
  callbackUri?: string;
  scope?: string;
  extConfig?: Record<string, Record<string, unknown>>;
  remark?: string;
}
