/** Membership Card Value Object */
export interface PlusCardVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Card ID */
  id?: number;
  /** åå¡æºæID */
  cardOrganizationId?: number;
  /** å¡å¸ç±»åï¼ä¼åå¡ãç¤¼åå¸ç­ */
  cardType?: 'DEFAULT' | 'MEMBER' | 'GIFT' | 'DISCOUNT' | 'CASH' | 'NORMAL';
  /** å¸çCodeç ç±»åï¼å¦äºç»´ç ãæ¡å½¢ç  */
  codeType?: 'DEFAULT' | 'TEXT' | 'BARCODE' | 'QRCODE';
  /** å¡å¸æ é¢ */
  title?: string;
  /** åæ·åç§° */
  brandName?: string;
  /** å¡å¸Logoå¾çURL */
  logoUrl?: string;
  /** ä½¿ç¨é¡»ç¥ */
  notice?: string;
  /** å¡å¸è¯¦ææè¿° */
  description?: string;
  /** å¡å¸é¢è² */
  color?: string;
  /** å¡å¸åºå­/åè¡é */
  quantity?: number;
  /** æ¯äººé¢åä¸é */
  getLimit?: number;
  /** æ¯å¦å¯åäº« */
  canShare?: boolean;
  /** æ¯å¦å¯è½¬èµ  */
  canGiveFriend?: boolean;
  /** çææ¶é´ */
  startTime?: string;
  /** å¤±ææ¶é´ */
  endTime?: string;
  /** å¡å¸ç¶æï¼å¯ç¨/ç¦ç¨/å é¤ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
