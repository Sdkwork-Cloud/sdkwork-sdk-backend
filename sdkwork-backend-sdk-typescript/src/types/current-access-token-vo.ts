import type { TokenResult } from './token-result';

/** å½åä¸ä¸æè®¿é®ä»¤çç»æ */
export interface CurrentAccessTokenVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** åºç¨ID */
  appId?: number;
  /** åºç¨åç§° */
  appName?: string;
  /** å¹³å° */
  platform?: 'UNKNOWN' | 'DEFAULT' | 'H5' | 'H5_WEIXIN' | 'WEB' | 'APP' | 'APP_PLUS' | 'APP_IOS' | 'APP_ANDROID' | 'APP_HARMONY' | 'DESKTOP' | 'DESKTOP_WINDOWS' | 'DESKTOP_MACOS' | 'DESKTOP_LINUX' | 'MP' | 'MP_WEIXIN' | 'MP_ALIPAY' | 'MP_BAIDU' | 'MP_TOUTIAO' | 'MP_LARK' | 'MP_QQ' | 'MP_KUAISHOU' | 'MP_JD' | 'MP_360' | 'MP_DINGTALK' | 'MP_ALI' | 'MP_WEIXIN_GAME' | 'MP_QQ_GAME' | 'MP_BAIDU_GAME' | 'MP_TOUTIAO_GAME' | 'QUICKAPP' | 'QUICKAPP_WEBVIEW' | 'QUICKAPP_WEBVIEW_UNION' | 'QUICKAPP_WEBVIEW_HUAWEI' | 'ADMIN' | 'CLI' | 'API' | 'OTHER';
  /** å½åç§æ·ID */
  tenantId?: number;
  /** å½åç»ç»ID */
  organizationId?: number;
  /** ç§æ·è®¿é®ä»¤ç */
  tenantAccessToken?: TokenResult;
  /** ç»ç»è®¿é®ä»¤ç */
  organizationAccessToken?: TokenResult;
}
