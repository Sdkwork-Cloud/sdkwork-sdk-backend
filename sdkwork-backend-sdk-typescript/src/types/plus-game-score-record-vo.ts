/** æ£çæ¸¸æç§¯åæµæ°´VO */
export interface PlusGameScoreRecordVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æµæ°´ID */
  recordId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** èµäºID */
  tournamentId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** æ¦åID */
  leaderboardId?: number;
  /** åæ´ç±»å */
  changeType?: 'MATCH_SETTLEMENT' | 'ROUND_SETTLEMENT' | 'TOURNAMENT_REWARD' | 'RANKING_REWARD' | 'CHALLENGE_STAKE' | 'CHALLENGE_REFUND' | 'CHALLENGE_REWARD' | 'ARENA_STAKE' | 'ARENA_REFUND' | 'ARENA_REWARD' | 'ROOM_REFUND' | 'MANUAL_ADJUST' | 'PENALTY';
  /** æè¡ç±»å */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** æ¦åå¨æç±»å */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** æ¦åèå´ç±»å */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** ä¸å¡æµæ°´å· */
  bizNo?: string;
  /** åæ´åå  */
  reason?: string;
  /** ç§¯ååæ´å */
  scoreBefore?: number;
  /** ç§¯ååå */
  scoreDelta?: number;
  /** ç§¯ååæ´å */
  scoreAfter?: number;
  /** ç­çº§ååæ´å */
  ratingBefore?: number;
  /** ç­çº§ååå */
  ratingDelta?: number;
  /** ç­çº§ååæ´å */
  ratingAfter?: number;
  /** ç­¹ç åæ´å */
  chipsBefore?: number;
  /** ç­¹ç åå */
  chipsDelta?: number;
  /** ç­¹ç åæ´å */
  chipsAfter?: number;
  /** æä½äººç¨æ·ID */
  operatorUserId?: number;
  /** åçæ¶é´ */
  occurredAt?: string;
  /** ç»ç®éå æ°æ® */
  settlementData?: Record<string, unknown>;
  /** æ©å±æ°æ® */
  extData?: Record<string, unknown>;
}
