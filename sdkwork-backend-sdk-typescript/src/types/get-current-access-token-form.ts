/** é¾å³°å½è¤°æ³å¢ ç»ç¸å/ç¼å­ç²çåæ£¶æµ ãå¢çéç° */
export interface GetCurrentAccessTokenForm {
  /** æ´ææ¤ID */
  appId: number;
  /** é©î½ç£éªå²å½´ */
  platform: 'UNKNOWN' | 'DEFAULT' | 'H5' | 'H5_WEIXIN' | 'WEB' | 'APP' | 'APP_PLUS' | 'APP_IOS' | 'APP_ANDROID' | 'APP_HARMONY' | 'DESKTOP' | 'DESKTOP_WINDOWS' | 'DESKTOP_MACOS' | 'DESKTOP_LINUX' | 'MP' | 'MP_WEIXIN' | 'MP_ALIPAY' | 'MP_BAIDU' | 'MP_TOUTIAO' | 'MP_LARK' | 'MP_QQ' | 'MP_KUAISHOU' | 'MP_JD' | 'MP_360' | 'MP_DINGTALK' | 'MP_ALI' | 'MP_WEIXIN_GAME' | 'MP_QQ_GAME' | 'MP_BAIDU_GAME' | 'MP_TOUTIAO_GAME' | 'QUICKAPP' | 'QUICKAPP_WEBVIEW' | 'QUICKAPP_WEBVIEW_UNION' | 'QUICKAPP_WEBVIEW_HUAWEI' | 'ADMIN' | 'CLI' | 'API' | 'OTHER';
}
