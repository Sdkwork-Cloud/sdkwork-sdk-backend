/** ä¼åå¡æ¨¡æ¿Value Object */
export interface PlusCardTemplateVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¨¡æ¿åç§° */
  name?: string;
  /** æ¨¡æ¿ç¼ç  */
  templateCode?: string;
  /** å¡çç±»å(æä¸¾) */
  cardType?: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  /** ç¼ç ç±»å(æä¸¾) */
  codeType?: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  /** æ é¢ */
  title?: string;
  /** æè¿° */
  description?: string;
  /** åçåç§° */
  brandName?: string;
  /** Logo URL */
  logoUrl?: string;
  /** å¬å */
  notice?: string;
  /** é¢è² */
  color?: string;
  /** æ°é */
  quantity?: number;
  /** è·åéå¶ */
  getLimit?: number;
  /** æ¯å¦å¯åäº« */
  canShare?: boolean;
  /** æ¯å¦å¯èµ å */
  canGiveFriend?: boolean;
  /** æä½ä½é¢ */
  minimumBalance?: number;
  /** åå§ä½é¢ */
  initialBalance?: number;
  /** ææ£ç */
  discountRate?: number;
  /** æææç±»å */
  validityType?: 'DEFAULT' | 'FIXED' | 'DAYS_AFTER_RECEIVE' | 'DAYS_AFTER_ACTIVATION';
  /** å¼å§æ¶é´ */
  startTime?: string;
  /** ç»ææ¶é´ */
  endTime?: string;
  /** ææå¤©æ° */
  validityDays?: number;
  /** æ¯å¦å é¤ */
  isDeleted?: boolean;
}
