import type { PlusGameLeaderboardEntryVO } from './plus-game-leaderboard-entry-vo';

/** 棋牌游戏排行榜VO */
export interface PlusGameLeaderboardVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 榜单ID */
  leaderboardId?: number;
  /** 榜单编号 */
  leaderboardNo?: string;
  /** 榜单名称 */
  name?: string;
  /** 榜单简称 */
  shortName?: string;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 排行类型 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 榜单周期类型 */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** 榜单范围类型 */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** 榜单范围归属ID */
  scopeOwnerId?: number;
  /** 榜单范围名称 */
  scopeName?: string;
  /** 赛季标识 */
  seasonKey?: string;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 榜单状态 */
  status?: 'DRAFT' | 'CALCULATING' | 'ACTIVE' | 'SETTLING' | 'SETTLED' | 'ARCHIVED';
  /** 是否仅统计排位 */
  rankedOnly?: boolean;
  /** 是否统计好友房 */
  includeFriendRoom?: boolean;
  /** 是否统计赛事房 */
  includeTournamentRoom?: boolean;
  /** 是否统计俱乐部房 */
  includeClubRoom?: boolean;
  /** 最少对局门槛 */
  minMatchCount?: number;
  /** 胜率榜最少对局门槛 */
  minWinRateMatchCount?: number;
  /** 参与人数 */
  totalParticipantCount?: number;
  /** 周期开始时间 */
  periodStartAt?: string;
  /** 周期结束时间 */
  periodEndAt?: string;
  /** 发布时间 */
  publishedAt?: string;
  /** 结算时间 */
  settledAt?: string;
  /** 榜单头部明细 */
  entries?: PlusGameLeaderboardEntryVO[];
}
