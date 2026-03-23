/** åºç¨å®è£åå®ä¹ */
export interface AppInstallPackage {
  /** å®è£åID */
  id?: string;
  /** å®è£ååç§° */
  name?: string;
  /** å®è£æ¥æºç±»å */
  sourceType?: 'GIT_REPOSITORY' | 'BINARY_URL' | 'APP_STORE' | 'CONTAINER_IMAGE' | 'MINI_PROGRAM' | 'WEB_URL' | 'SCRIPT';
  /** å®è£åæ ¼å¼ */
  packageFormat?: 'SOURCE_CODE' | 'JAR' | 'WAR' | 'ZIP' | 'TAR_GZ' | 'APK' | 'IPA' | 'EXE' | 'MSI' | 'DMG' | 'APPIMAGE' | 'DEB' | 'RPM' | 'DOCKER_IMAGE' | 'MINI_PROGRAM_PACKAGE' | 'OTHER';
  /** ç®æ å¹³å° */
  platform?: 'UNKNOWN' | 'DEFAULT' | 'H5' | 'H5_WEIXIN' | 'WEB' | 'APP' | 'APP_PLUS' | 'APP_IOS' | 'APP_ANDROID' | 'APP_HARMONY' | 'DESKTOP' | 'DESKTOP_WINDOWS' | 'DESKTOP_MACOS' | 'DESKTOP_LINUX' | 'MP' | 'MP_WEIXIN' | 'MP_ALIPAY' | 'MP_BAIDU' | 'MP_TOUTIAO' | 'MP_LARK' | 'MP_QQ' | 'MP_KUAISHOU' | 'MP_JD' | 'MP_360' | 'MP_DINGTALK' | 'MP_ALI' | 'MP_WEIXIN_GAME' | 'MP_QQ_GAME' | 'MP_BAIDU_GAME' | 'MP_TOUTIAO_GAME' | 'QUICKAPP' | 'QUICKAPP_WEBVIEW' | 'QUICKAPP_WEBVIEW_UNION' | 'QUICKAPP_WEBVIEW_HUAWEI' | 'ADMIN' | 'CLI' | 'API' | 'OTHER';
  /** å®è£èµæºURL */
  url?: string;
  /** Gitä»åºå°å */
  repositoryUrl?: string;
  /** Gitåæ¯ */
  branch?: string;
  /** Gitæ ç­¾ */
  tag?: string;
  /** Gitæäº¤ID */
  commitId?: string;
  /** æ ¡éªç®æ³ */
  checksumAlgorithm?: string;
  /** æ ¡éªå¼ */
  checksum?: string;
  /** CPUæ¶æ */
  architecture?: string;
  /** æä»¶å¤§å°ï¼å­èï¼ */
  sizeBytes?: number;
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
}
