/** æ£çæ¸¸ææå°æ¥è¯¢è¡¨å */
export interface PlusGameArenaQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** åå»ºæä¸»ç¨æ·ID */
  ownerUserId?: number;
  /** å½åæä¸»ç¨æ·ID */
  currentChampionUserId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** æå°ç¶æ */
  status?: 'OPEN' | 'LOCKED' | 'CLOSED';
}
