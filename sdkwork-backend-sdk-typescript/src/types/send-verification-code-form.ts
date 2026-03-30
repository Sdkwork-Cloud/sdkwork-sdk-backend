/** 鍙戦€侀獙璇佺爜璇锋眰琛ㄥ崟 */
export interface SendVerificationCodeForm {
  identifier: string;
  /** 楠岃瘉鏂瑰紡 */
  method: 'email' | 'phone' | 'sms';
  type: string;
}
