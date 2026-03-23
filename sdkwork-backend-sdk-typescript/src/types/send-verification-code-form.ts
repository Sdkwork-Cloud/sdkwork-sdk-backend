/** éæ¦â¬ä¾ççä½ºççéç°çã¥å´ */
export interface SendVerificationCodeForm {
  identifier: string;
  /** æ¥ å²çéç°ç´¡ */
  method: 'email' | 'phone' | 'sms';
  type: string;
}
