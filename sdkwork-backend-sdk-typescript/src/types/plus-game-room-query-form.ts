/** æ£çæ¸¸ææ¿é´æ¥è¯¢è¡¨å */
export interface PlusGameRoomQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** æ¿ä¸»ç¨æ·ID */
  userId?: number;
  /** ç©æ³å®ä¹ID */
  definitionId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** æ¿é´å· */
  roomNo?: string;
  /** æ¿é´å·æ¨¡ç³å¹é */
  roomNoLike?: string;
  /** æ¿é´åç§°æ¨¡ç³å¹é */
  nameLike?: string;
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** æ¿é´ç¶æ */
  status?: 'WAITING' | 'READY' | 'PLAYING' | 'SETTLING' | 'FINISHED' | 'DISMISSED' | 'EXPIRED';
  /** å¯è§æ§ */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'PASSWORD';
  /** æ¯å¦æä½æ¿ */
  ranked?: boolean;
  /** æ¯å¦åè®¸è§æ */
  allowSpectator?: boolean;
  /** æ¯å¦è®¡å¥æ¦å */
  leaderboardEligible?: boolean;
  /** æ¯å¦å¯ç¨åæ¾ */
  replayEnabled?: boolean;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** å½åå¯¹å±ID */
  currentMatchId?: number;
}
