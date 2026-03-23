import type { PlusAccountHistoryVO } from './plus-account-history-vo';

/** ç¨æ·è´¦æ·VOï¼è®°å½ä½é¢åç§¯åä¿¡æ¯ */
export interface PlusAccountVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å³èçç¨æ·IDï¼å¯¹åº plus_user è¡¨çä¸»é® */
  userId?: number;
  /** è´¦æ·ç±»å */
  accountType?: 'DEFAULT' | 'CASH' | 'POINTS' | 'TOKEN';
  /** å¯ç¨ä½é¢ */
  availableBalance?: number;
  /** å»ç»ä½é¢ï¼ä¾å¦æç°ç³è¯·ä¸­ */
  frozenBalance?: number;
  /** å½åå¯ç¨ç§¯å */
  availablePoints?: number;
  /** å½åå»ç»ç§¯å */
  frozenPoints?: number;
  /** è´¦æ·ç¶æ (1-æ¿æ´», 2-å»ç», 3-å·²æ³¨é) */
  status?: 'DEFAULT' | 'ACTIVE' | 'FROZEN' | 'CLOSED';
  /** è´¦æ·åå²è®°å½ */
  historyList?: PlusAccountHistoryVO[];
}
