/** 获取当前租户/组织访问令牌请求 */
export interface GetCurrentAccessTokenForm {
  /** 应用ID */
  appId: number;
  /** 目标平台 */
  platform: 'UNKNOWN' | 'DEFAULT' | 'H5' | 'H5_WEIXIN' | 'WEB' | 'APP' | 'APP_PLUS' | 'APP_IOS' | 'APP_ANDROID' | 'APP_HARMONY' | 'DESKTOP' | 'DESKTOP_WINDOWS' | 'DESKTOP_MACOS' | 'DESKTOP_LINUX' | 'MP' | 'MP_WEIXIN' | 'MP_ALIPAY' | 'MP_BAIDU' | 'MP_TOUTIAO' | 'MP_LARK' | 'MP_QQ' | 'MP_KUAISHOU' | 'MP_JD' | 'MP_360' | 'MP_DINGTALK' | 'MP_ALI' | 'MP_WEIXIN_GAME' | 'MP_QQ_GAME' | 'MP_BAIDU_GAME' | 'MP_TOUTIAO_GAME' | 'QUICKAPP' | 'QUICKAPP_WEBVIEW' | 'QUICKAPP_WEBVIEW_UNION' | 'QUICKAPP_WEBVIEW_HUAWEI' | 'ADMIN' | 'CLI' | 'API' | 'OTHER';
}
