/** æ£çæ¸¸æåæ¾æ¥è¯¢è¡¨å */
export interface PlusGameReplayQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** åæ¾å½å±ç¨æ·ID */
  ownerUserId?: number;
  /** åæ¾æ é¢æ¨¡ç³å¹é */
  titleLike?: string;
  /** åæ¾ç¶æ */
  status?: 'GENERATING' | 'READY' | 'EXPIRED' | 'DELETED';
  /** æ¯å¦å¬å¼å¯è§ */
  publicVisible?: boolean;
  /** æ¯å¦åè®¸åäº« */
  allowShare?: boolean;
}
