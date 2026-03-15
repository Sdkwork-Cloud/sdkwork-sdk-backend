/** 棋牌游戏排行榜明细VO */
export interface PlusGameLeaderboardEntryVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 榜单明细ID */
  entryId?: number;
  /** 榜单ID */
  leaderboardId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 排行类型 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 榜单周期类型 */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** 榜单范围类型 */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** 榜单范围归属ID */
  scopeOwnerId?: number;
  /** 赛季标识 */
  seasonKey?: string;
  /** 昵称快照 */
  nicknameSnapshot?: string;
  /** 头像URL */
  avatarUrl?: string;
  /** 当前名次 */
  rankNo?: number;
  /** 上一期名次 */
  previousRankNo?: number;
  /** 历史最佳名次 */
  peakRankNo?: number;
  /** 榜单明细状态 */
  status?: 'ACTIVE' | 'REWARDED' | 'INVALID';
  /** 成绩值 */
  scoreValue?: number;
  /** 成绩变化 */
  scoreDelta?: number;
  /** 同分辅助值 */
  tieBreakerValue?: number;
  /** 展示值 */
  displayValue?: string;
  /** 有效对局数 */
  totalMatchCount?: number;
  /** 胜场数 */
  winCount?: number;
  /** 负场数 */
  loseCount?: number;
  /** 平局数 */
  drawCount?: number;
  /** 连胜数 */
  streakCount?: number;
  /** 是否已发奖 */
  rewardGranted?: boolean;
  /** 奖励发放时间 */
  rewardIssuedAt?: string;
  /** 榜单徽章编码 */
  badgeCode?: string;
}
