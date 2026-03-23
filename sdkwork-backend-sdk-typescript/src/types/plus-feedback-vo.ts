/** åé¦ä¿¡æ¯VO */
export interface PlusFeedbackVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å·ï¼ç¨äºä¹è§éæ§å¶ */
  version?: number;
  /** ç¨æ·ID(å¤é®å³èplus_user.id) */
  userId?: number;
}
