/** æ£çæ¸¸æç©å®¶ç»è®¡VO */
export interface PlusGameStatsVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç»è®¡ID */
  statsId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** ç»è®¡èå´ç±»å */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** ç»è®¡èå´å½å±ID */
  scopeOwnerId?: number;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** æµç§°å¿«ç§ */
  nicknameSnapshot?: string;
  /** å¤´åURL */
  avatarUrl?: string;
  /** æè¡å£å¾ */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** æ»å¯¹å±æ° */
  totalMatchCount?: number;
  /** èåºæ° */
  winCount?: number;
  /** è´åºæ° */
  loseCount?: number;
  /** å¹³å±æ° */
  drawCount?: number;
  /** éè·æ° */
  escapeCount?: number;
  /** æ»å°å±æ° */
  totalRoundCount?: number;
  /** æ»å¨ä½æ° */
  totalActionCount?: number;
  /** æ»ææå¨ä½æ° */
  totalMoveCount?: number;
  /** æ»å¯¹å±æ¶é¿ç§æ° */
  totalDurationSeconds?: number;
  /** å½åç§¯å */
  score?: number;
  /** å½åç­çº§å */
  ratingScore?: number;
  /** å½åç­¹ç ä½é¢ */
  chipsBalance?: number;
  /** ç´¯è®¡æ¶ç */
  profitAmount?: number;
  /** èç */
  winRate?: number;
  /** å½åè¿è */
  currentWinStreak?: number;
  /** æä½³è¿è */
  bestWinStreak?: number;
  /** åå²æé«ç­çº§å */
  highestRatingScore?: number;
  /** åå²æä½³åæ¬¡ */
  bestRankNo?: number;
  /** åå²æä½³æ¥æ¦åæ¬¡ */
  bestDailyRankNo?: number;
  /** åå²æä½³å¨æ¦åæ¬¡ */
  bestWeeklyRankNo?: number;
  /** åå²æä½³ææ¦åæ¬¡ */
  bestMonthlyRankNo?: number;
  /** åå²æä½³å­£åº¦æ¦åæ¬¡ */
  bestQuarterlyRankNo?: number;
  /** åå²æä½³å¹´æ¦åæ¬¡ */
  bestYearlyRankNo?: number;
  /** è£èªæ°é */
  honorCount?: number;
  /** å½åæè¡æ¦åæ¬¡ */
  leaderboardPosition?: number;
  /** æè¿å¯¹å±æ¶é´ */
  lastMatchAt?: string;
  /** æææ»åºæ¬¡ */
  challengeTotalCount?: number;
  /** ææèåº */
  challengeWinCount?: number;
  /** ææè´åº */
  challengeLoseCount?: number;
  /** æ»ææåæ¬¡æ° */
  arenaAttackWinCount?: number;
  /** å®ææåæ¬¡æ° */
  arenaDefenseWinCount?: number;
  /** å®æå¤±è´¥æ¬¡æ° */
  arenaDefenseLoseCount?: number;
  /** æä½³å®æè¿è */
  arenaBestDefenseStreak?: number;
}
