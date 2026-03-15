/** 棋牌游戏荣誉记录VO */
export interface PlusGameHonorVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 荣誉ID */
  honorId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 赛季标识 */
  seasonKey?: string;
  /** 荣誉来源类型 */
  sourceType?: 'LEADERBOARD' | 'TOURNAMENT' | 'SEASON' | 'ACTIVITY' | 'SYSTEM';
  /** 荣誉来源ID */
  sourceId?: number;
  /** 榜单ID */
  leaderboardId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 榜单周期类型 */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** 排行类型 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 荣誉状态 */
  status?: 'PENDING' | 'GRANTED' | 'EXPIRED' | 'REVOKED';
  /** 俱乐部ID */
  clubId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 荣誉标题 */
  title?: string;
  /** 荣誉副标题 */
  subtitle?: string;
  /** 荣誉说明 */
  description?: string;
  /** 徽章编码 */
  badgeCode?: string;
  /** 图标地址 */
  iconUrl?: string;
  /** 对应名次 */
  rankNo?: number;
  /** 成绩值 */
  scoreValue?: number;
  /** 是否展示到荣誉墙 */
  wallVisible?: boolean;
  /** 发放时间 */
  grantedAt?: string;
  /** 过期时间 */
  expiredAt?: string;
}
