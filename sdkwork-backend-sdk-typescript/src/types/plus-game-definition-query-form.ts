/** æ£çæ¸¸æç©æ³å®ä¹æ¥è¯¢è¡¨å */
export interface PlusGameDefinitionQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ç©æ³ç¼ç  */
  code?: string;
  /** ç©æ³ç¼ç æ¨¡ç³å¹é */
  codeLike?: string;
  /** ç©æ³åç§°æ¨¡ç³å¹é */
  nameLike?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³åç±» */
  category?: 'BOARD' | 'CARD' | 'TILE' | 'MIXED';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
  /** æ¯å¦æ¯ææä½ */
  ranked?: boolean;
  /** æ¯å¦æ¯æåæ¾ */
  supportsReplay?: boolean;
  /** æ¯å¦æ¯æèµäº */
  supportsTournament?: boolean;
}
