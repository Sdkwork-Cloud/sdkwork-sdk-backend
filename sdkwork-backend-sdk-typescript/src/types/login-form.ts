/** é§è¯²ç¶çéç°çã¥å´ */
export interface LoginForm {
  /** é§è¯²ç¶ç»«è¯²ç· */
  type?: 'MOBILE' | 'EMAIL' | 'OAUTH' | 'USERNAME';
  /** é­î¾î */
  email?: string;
  /** P ho ne */
  phone?: string;
  username: string;
  /** çµåç */
  password: string;
  /** éªå²å½´ */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** C ap tc ha */
  captcha?: string;
  /** æ¥ å²çé®ä¸¡D */
  captchaId?: string;
  /** R em em be rM e */
  rememberMe?: boolean;
  /** V er if ic at io nC od e */
  verificationCode?: string;
  /** é­â¬çé£ç */
  invitationCode?: string;
}
