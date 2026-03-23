/** æ£çæ¸¸æå¯¹å±VO */
export interface PlusGameMatchVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å¯¹å±ID */
  matchId?: number;
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
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** å¯¹å±ç¶æ */
  status?: 'CREATED' | 'RUNNING' | 'PAUSED' | 'SETTLING' | 'FINISHED' | 'ABORTED';
  /** æ¯å¦æä½å¯¹å± */
  ranked?: boolean;
  /** ç©å®¶æ»æ° */
  totalPlayerCount?: number;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** å½åè½®æ¬¡ */
  currentRoundNo?: number;
  /** è®¡åæ»è½®æ¬¡ */
  maxRoundCount?: number;
  /** å½åè¡å¨åº§ä½ */
  currentTurnSeatNo?: number;
  /** åºå®¶/åæåº§ä½ */
  dealerSeatNo?: number;
  /** è·èåº§ä½ */
  winnerSeatNo?: number;
  /** è·èç¨æ·ID */
  winnerUserId?: number;
  /** åæ¾ID */
  replayId?: number;
  /** å¨ä½æ»æ° */
  actionCount?: number;
  /** ææå¨ä½æ° */
  moveCount?: number;
  /** æ¯å¦è®¡å¥æ¦å */
  leaderboardEligible?: boolean;
  /** æ¯å¦è®¡å¥ç»è®¡ */
  validForStats?: boolean;
  /** ç»ææ¯å¦å·²ç¡®è®¤ */
  resultConfirmed?: boolean;
  /** æ¯å¦å¼å¸¸ç»æ */
  abnormalFinished?: boolean;
  /** å¼å¸¸åå  */
  invalidReason?: string;
  /** å¼å§æ¶é´ */
  startedAt?: string;
  /** ç»ç®æ¶é´ */
  settledAt?: string;
  /** ç»ææ¶é´ */
  endedAt?: string;
  /** æç»­ç§æ° */
  durationSeconds?: number;
}
