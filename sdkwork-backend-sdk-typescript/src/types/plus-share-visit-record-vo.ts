/** åäº«è®¿é®è®°å½Value Object */
export interface PlusShareVisitRecordVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** è®°å½ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å³èçåäº«ID */
  shareId?: number;
  /** è®¿é®èIPå°å */
  ipAddress?: string;
  /** è®¿é®èUser-Agent */
  userAgent?: string;
  /** è®¿é®æ¶é´ */
  accessedAt?: string;
  /** æ¯å¦æåè®¿é® */
  success?: boolean;
}
