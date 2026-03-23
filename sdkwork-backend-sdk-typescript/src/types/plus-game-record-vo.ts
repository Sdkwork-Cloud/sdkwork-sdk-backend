/** æ£çæ¸¸ææç»©VO */
export interface PlusGameRecordVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æç»©ID */
  recordId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
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
  /** åº§ä½å· */
  seatNo?: number;
  /** éä¼å· */
  teamNo?: number;
  /** å¯¹å±ç»æ */
  resultType?: 'PENDING' | 'WIN' | 'LOSE' | 'DRAW' | 'ESCAPE' | 'DISMISS';
  /** åæ¬¡ */
  rankNo?: number;
  /** æµç§°å¿«ç§ */
  nicknameSnapshot?: string;
  /** å¤´åURL */
  avatarUrl?: string;
  /** æ¯å¦èè */
  winner?: boolean;
  /** æ¯å¦éè· */
  escaped?: boolean;
  /** æ¯å¦è®¡å¥æ¦å */
  leaderboardEligible?: boolean;
  /** å¨ä½æ° */
  actionCount?: number;
  /** ææå¨ä½æ° */
  moveCount?: number;
  /** èµåç§¯å */
  scoreBefore?: number;
  /** ç§¯ååå */
  scoreDelta?: number;
  /** èµåç§¯å */
  scoreAfter?: number;
  /** èµåç­çº§å */
  ratingBefore?: number;
  /** ç­çº§ååå */
  ratingDelta?: number;
  /** èµåç­çº§å */
  ratingAfter?: number;
  /** èµåç­¹ç  */
  chipsBefore?: number;
  /** ç­¹ç åå */
  chipsDelta?: number;
  /** èµåç­¹ç  */
  chipsAfter?: number;
  /** åä¸æ¶é´ */
  joinedAt?: string;
  /** å®ææ¶é´ */
  finishedAt?: string;
  /** åå²æä½³åæ¬¡å¿«ç§ */
  bestRankSnapshot?: number;
  /** ç©å®¶ç»ç®æ°æ® */
  settlementData?: Record<string, unknown>;
  /** è£èªå¿«ç§ */
  honorSnapshot?: Record<string, unknown>;
}
