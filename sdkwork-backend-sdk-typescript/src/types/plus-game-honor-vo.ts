/** æ£çæ¸¸æè£èªè®°å½VO */
export interface PlusGameHonorVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** è£èªID */
  honorId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** è£èªæ¥æºç±»å */
  sourceType?: 'LEADERBOARD' | 'TOURNAMENT' | 'SEASON' | 'ACTIVITY' | 'SYSTEM';
  /** è£èªæ¥æºID */
  sourceId?: number;
  /** æ¦åID */
  leaderboardId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** æ¦åå¨æç±»å */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** æè¡ç±»å */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** è£èªç¶æ */
  status?: 'PENDING' | 'GRANTED' | 'EXPIRED' | 'REVOKED';
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** è£èªæ é¢ */
  title?: string;
  /** è£èªå¯æ é¢ */
  subtitle?: string;
  /** è£èªè¯´æ */
  description?: string;
  /** å¾½ç« ç¼ç  */
  badgeCode?: string;
  /** å¾æ å°å */
  iconUrl?: string;
  /** å¯¹åºåæ¬¡ */
  rankNo?: number;
  /** æç»©å¼ */
  scoreValue?: number;
  /** æ¯å¦å±ç¤ºå°è£èªå¢ */
  wallVisible?: boolean;
  /** åæ¾æ¶é´ */
  grantedAt?: string;
  /** è¿ææ¶é´ */
  expiredAt?: string;
}
