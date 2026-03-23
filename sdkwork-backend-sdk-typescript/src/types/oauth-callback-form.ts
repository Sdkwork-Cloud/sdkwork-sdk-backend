/** OAuth callback form */
export interface OAuthCallbackForm {
  /** OAuthæä¾åç±»å */
  provider?: 'WECHAT' | 'QQ' | 'WEIBO' | 'GITHUB' | 'GOOGLE' | 'FACEBOOK' | 'TWITTER' | 'LINKEDIN' | 'MICROSOFT' | 'APPLE' | 'ALIPAY' | 'DINGTALK' | 'GITEE';
  /** ææç  */
  code?: string;
  /** ç¶æåæ°ï¼ç¨äºéªè¯è¯·æ±ä¸è´æ§ */
  state?: string;
}
