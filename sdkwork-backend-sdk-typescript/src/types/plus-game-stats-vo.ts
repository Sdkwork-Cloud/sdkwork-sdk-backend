/** 棋牌游戏玩家统计VO */
export interface PlusGameStatsVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 统计ID */
  statsId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 赛季标识 */
  seasonKey?: string;
  /** 统计范围类型 */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** 统计范围归属ID */
  scopeOwnerId?: number;
  /** 俱乐部ID */
  clubId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 昵称快照 */
  nicknameSnapshot?: string;
  /** 头像URL */
  avatarUrl?: string;
  /** 排行口径 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 总对局数 */
  totalMatchCount?: number;
  /** 胜场数 */
  winCount?: number;
  /** 负场数 */
  loseCount?: number;
  /** 平局数 */
  drawCount?: number;
  /** 逃跑数 */
  escapeCount?: number;
  /** 总小局数 */
  totalRoundCount?: number;
  /** 总动作数 */
  totalActionCount?: number;
  /** 总有效动作数 */
  totalMoveCount?: number;
  /** 总对局时长秒数 */
  totalDurationSeconds?: number;
  /** 当前积分 */
  score?: number;
  /** 当前等级分 */
  ratingScore?: number;
  /** 当前筹码余额 */
  chipsBalance?: number;
  /** 累计收益 */
  profitAmount?: number;
  /** 胜率 */
  winRate?: number;
  /** 当前连胜 */
  currentWinStreak?: number;
  /** 最佳连胜 */
  bestWinStreak?: number;
  /** 历史最高等级分 */
  highestRatingScore?: number;
  /** 历史最佳名次 */
  bestRankNo?: number;
  /** 历史最佳日榜名次 */
  bestDailyRankNo?: number;
  /** 历史最佳周榜名次 */
  bestWeeklyRankNo?: number;
  /** 历史最佳月榜名次 */
  bestMonthlyRankNo?: number;
  /** 历史最佳季度榜名次 */
  bestQuarterlyRankNo?: number;
  /** 历史最佳年榜名次 */
  bestYearlyRankNo?: number;
  /** 荣誉数量 */
  honorCount?: number;
  /** 当前排行榜名次 */
  leaderboardPosition?: number;
  /** 最近对局时间 */
  lastMatchAt?: string;
  /** 挑战总场次 */
  challengeTotalCount?: number;
  /** 挑战胜场 */
  challengeWinCount?: number;
  /** 挑战负场 */
  challengeLoseCount?: number;
  /** 攻擂成功次数 */
  arenaAttackWinCount?: number;
  /** 守擂成功次数 */
  arenaDefenseWinCount?: number;
  /** 守擂失败次数 */
  arenaDefenseLoseCount?: number;
  /** 最佳守擂连胜 */
  arenaBestDefenseStreak?: number;
}
