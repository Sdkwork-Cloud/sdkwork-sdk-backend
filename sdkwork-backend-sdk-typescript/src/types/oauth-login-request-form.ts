/** OAuth login request form */
export interface OAuthLoginRequestForm {
  /** OAuthæä¾åç±»å */
  provider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** åè°URL */
  redirectUri?: string;
  /** ææèå´ */
  scope?: string;
  /** ç¶æåæ°ï¼ç¨äºé²æ­¢CSRFæ»å» */
  state?: string;
}
