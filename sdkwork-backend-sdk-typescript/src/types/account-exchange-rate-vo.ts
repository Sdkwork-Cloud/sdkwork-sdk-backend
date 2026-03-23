/** è´¦æ·åæ¢æ¯ä¾VO */
export interface AccountExchangeRateVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** éç½®é® */
  configKey?: string;
  /** ç§¯ååæ¢ç°éæ¯ä¾ï¼Nç§¯å=1åï¼ */
  pointsToCashRate?: number;
  /** å¤æ³¨ */
  remarks?: string;
}
