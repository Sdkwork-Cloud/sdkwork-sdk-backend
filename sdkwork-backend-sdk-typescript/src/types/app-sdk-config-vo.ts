import type { MiniProgramSdkConfigVO } from './mini-program-sdk-config-vo';
import type { MobileAppSdkConfigVO } from './mobile-app-sdk-config-vo';
import type { OfficialAccountSdkConfigVO } from './official-account-sdk-config-vo';

/** App SDK配置 */
export interface AppSdkConfigVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 平台 */
  platform?: 'UNKNOWN' | 'DEFAULT' | 'H5' | 'H5_WEIXIN' | 'WEB' | 'APP' | 'APP_PLUS' | 'APP_IOS' | 'APP_ANDROID' | 'APP_HARMONY' | 'DESKTOP' | 'DESKTOP_WINDOWS' | 'DESKTOP_MACOS' | 'DESKTOP_LINUX' | 'MP' | 'MP_WEIXIN' | 'MP_ALIPAY' | 'MP_BAIDU' | 'MP_TOUTIAO' | 'MP_LARK' | 'MP_QQ' | 'MP_KUAISHOU' | 'MP_JD' | 'MP_360' | 'MP_DINGTALK' | 'MP_ALI' | 'MP_WEIXIN_GAME' | 'MP_QQ_GAME' | 'MP_BAIDU_GAME' | 'MP_TOUTIAO_GAME' | 'QUICKAPP' | 'QUICKAPP_WEBVIEW' | 'QUICKAPP_WEBVIEW_UNION' | 'QUICKAPP_WEBVIEW_HUAWEI' | 'ADMIN' | 'CLI' | 'API' | 'OTHER';
  /** 微信公众号配置 */
  officialAccount?: OfficialAccountSdkConfigVO;
  /** 微信小程序配置 */
  miniProgram?: MiniProgramSdkConfigVO;
  /** 应用配置 */
  app?: MobileAppSdkConfigVO;
}
