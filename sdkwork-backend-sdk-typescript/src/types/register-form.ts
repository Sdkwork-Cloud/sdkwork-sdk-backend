/** é¢ã¦åå¨ã¥å½çéç°çã¥å´ */
export interface RegisterForm {
  /** U se rn am e */
  username?: string;
  password: string;
  /** çº­î¿î»çµåç */
  confirmPassword?: string;
  email?: string;
  /** P ho ne */
  phone?: string;
  /** C ap tc ha */
  captcha?: string;
  /** æ¥ å²çé®ä¸¡D */
  captchaId?: string;
  /** å¨ã¥å½ç»«è¯²ç· */
  type?: 'DEFAULT' | 'EMAIL' | 'PHONE';
  /** V er if ic at io nC od e */
  verificationCode?: string;
  /** é­â¬çé£ç */
  invitationCode?: string;
}
