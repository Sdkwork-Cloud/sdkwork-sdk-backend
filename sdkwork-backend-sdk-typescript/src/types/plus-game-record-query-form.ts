/** æ£çæ¸¸ææç»©æ¥è¯¢è¡¨å */
export interface PlusGameRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ç©å®¶ç¨æ·IDï¼ä¸ä¼ è¡¨ç¤ºæ¥è¯¢å¨éæç»© */
  userId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** åº§ä½å· */
  seatNo?: number;
  /** æ¯å¦è·è */
  winner?: boolean;
  /** æ¯å¦éè· */
  escaped?: boolean;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** ç»æç±»å */
  resultType?: 'PENDING' | 'WIN' | 'LOSE' | 'DRAW' | 'ESCAPE' | 'DISMISS';
}
