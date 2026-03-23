/** æ£çæ¸¸ææè¡æ¦æç»VO */
export interface PlusGameLeaderboardEntryVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¦åæç»ID */
  entryId?: number;
  /** æ¦åID */
  leaderboardId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** æè¡ç±»å */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** æ¦åå¨æç±»å */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** æ¦åèå´ç±»å */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** æ¦åèå´å½å±ID */
  scopeOwnerId?: number;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** æµç§°å¿«ç§ */
  nicknameSnapshot?: string;
  /** å¤´åURL */
  avatarUrl?: string;
  /** å½ååæ¬¡ */
  rankNo?: number;
  /** ä¸ä¸æåæ¬¡ */
  previousRankNo?: number;
  /** åå²æä½³åæ¬¡ */
  peakRankNo?: number;
  /** æ¦åæç»ç¶æ */
  status?: 'ACTIVE' | 'REWARDED' | 'INVALID';
  /** æç»©å¼ */
  scoreValue?: number;
  /** æç»©åå */
  scoreDelta?: number;
  /** ååè¾å©å¼ */
  tieBreakerValue?: number;
  /** å±ç¤ºå¼ */
  displayValue?: string;
  /** ææå¯¹å±æ° */
  totalMatchCount?: number;
  /** èåºæ° */
  winCount?: number;
  /** è´åºæ° */
  loseCount?: number;
  /** å¹³å±æ° */
  drawCount?: number;
  /** è¿èæ° */
  streakCount?: number;
  /** æ¯å¦å·²åå¥ */
  rewardGranted?: boolean;
  /** å¥å±åæ¾æ¶é´ */
  rewardIssuedAt?: string;
  /** æ¦åå¾½ç« ç¼ç  */
  badgeCode?: string;
}
