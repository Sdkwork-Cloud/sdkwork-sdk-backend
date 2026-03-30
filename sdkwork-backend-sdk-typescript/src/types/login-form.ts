/** 鐧诲綍璇锋眰琛ㄥ崟 */
export interface LoginForm {
  /** 鐧诲綍绫诲瀷 */
  type?: 'MOBILE' | 'EMAIL' | 'OAUTH' | 'USERNAME';
  /** 閭 */
  email?: string;
  /** P ho ne */
  phone?: string;
  username: string;
  /** 瀵嗙爜 */
  password: string;
  /** 骞冲彴 */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** C ap tc ha */
  captcha?: string;
  /** 楠岃瘉鐮両D */
  captchaId?: string;
  /** R em em be rM e */
  rememberMe?: boolean;
  /** V er if ic at io nC od e */
  verificationCode?: string;
  /** 閭€璇风爜 */
  invitationCode?: string;
}
