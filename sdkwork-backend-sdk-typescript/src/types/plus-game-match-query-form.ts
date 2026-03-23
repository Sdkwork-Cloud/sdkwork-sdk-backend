/** æ£çæ¸¸æå¯¹å±æ¥è¯¢è¡¨å */
export interface PlusGameMatchQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ç©æ³å®ä¹ID */
  definitionId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** å¯¹å±ç¼å· */
  matchNo?: string;
  /** å¯¹å±ç¼å·æ¨¡ç³å¹é */
  matchNoLike?: string;
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** å¯¹å±ç¶æ */
  status?: 'CREATED' | 'RUNNING' | 'PAUSED' | 'SETTLING' | 'FINISHED' | 'ABORTED';
  /** æ¯å¦æä½å¯¹å± */
  ranked?: boolean;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** è·èç¨æ·ID */
  winnerUserId?: number;
  /** åæ¾ID */
  replayId?: number;
  /** æ¯å¦è®¡å¥æ¦å */
  leaderboardEligible?: boolean;
  /** æ¯å¦è®¡å¥ç»è®¡ */
  validForStats?: boolean;
  /** æ¯å¦å·²ç¡®è®¤ç»æ */
  resultConfirmed?: boolean;
  /** æ¯å¦å¼å¸¸ç»æ */
  abnormalFinished?: boolean;
}
