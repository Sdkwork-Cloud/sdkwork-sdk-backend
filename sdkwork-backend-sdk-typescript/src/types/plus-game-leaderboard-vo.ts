import type { PlusGameLeaderboardEntryVO } from './plus-game-leaderboard-entry-vo';

/** æ£çæ¸¸ææè¡æ¦VO */
export interface PlusGameLeaderboardVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¦åID */
  leaderboardId?: number;
  /** æ¦åç¼å· */
  leaderboardNo?: string;
  /** æ¦ååç§° */
  name?: string;
  /** æ¦åç®ç§° */
  shortName?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** æè¡ç±»å */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** æ¦åå¨æç±»å */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** æ¦åèå´ç±»å */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** æ¦åèå´å½å±ID */
  scopeOwnerId?: number;
  /** æ¦åèå´åç§° */
  scopeName?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** æ¦åç¶æ */
  status?: 'DRAFT' | 'CALCULATING' | 'ACTIVE' | 'SETTLING' | 'SETTLED' | 'ARCHIVED';
  /** æ¯å¦ä»ç»è®¡æä½ */
  rankedOnly?: boolean;
  /** æ¯å¦ç»è®¡å¥½åæ¿ */
  includeFriendRoom?: boolean;
  /** æ¯å¦ç»è®¡èµäºæ¿ */
  includeTournamentRoom?: boolean;
  /** æ¯å¦ç»è®¡ä¿±ä¹é¨æ¿ */
  includeClubRoom?: boolean;
  /** æå°å¯¹å±é¨æ§ */
  minMatchCount?: number;
  /** èçæ¦æå°å¯¹å±é¨æ§ */
  minWinRateMatchCount?: number;
  /** åä¸äººæ° */
  totalParticipantCount?: number;
  /** å¨æå¼å§æ¶é´ */
  periodStartAt?: string;
  /** å¨æç»ææ¶é´ */
  periodEndAt?: string;
  /** åå¸æ¶é´ */
  publishedAt?: string;
  /** ç»ç®æ¶é´ */
  settledAt?: string;
  /** æ¦åå¤´é¨æç» */
  entries?: PlusGameLeaderboardEntryVO[];
}
