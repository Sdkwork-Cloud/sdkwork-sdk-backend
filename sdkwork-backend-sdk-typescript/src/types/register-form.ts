/** 鐢ㄦ埛娉ㄥ唽璇锋眰琛ㄥ崟 */
export interface RegisterForm {
  /** U se rn am e */
  username?: string;
  password: string;
  /** 纭瀵嗙爜 */
  confirmPassword?: string;
  email?: string;
  /** P ho ne */
  phone?: string;
  /** C ap tc ha */
  captcha?: string;
  /** 楠岃瘉鐮両D */
  captchaId?: string;
  /** 娉ㄥ唽绫诲瀷 */
  type?: 'DEFAULT' | 'EMAIL' | 'PHONE';
  /** V er if ic at io nC od e */
  verificationCode?: string;
  /** 閭€璇风爜 */
  invitationCode?: string;
}
