/** 棋牌游戏积分流水VO */
export interface PlusGameScoreRecordVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 流水ID */
  recordId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 赛季标识 */
  seasonKey?: string;
  /** 赛事ID */
  tournamentId?: number;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 榜单ID */
  leaderboardId?: number;
  /** 变更类型 */
  changeType?: 'MATCH_SETTLEMENT' | 'ROUND_SETTLEMENT' | 'TOURNAMENT_REWARD' | 'RANKING_REWARD' | 'CHALLENGE_STAKE' | 'CHALLENGE_REFUND' | 'CHALLENGE_REWARD' | 'ARENA_STAKE' | 'ARENA_REFUND' | 'ARENA_REWARD' | 'ROOM_REFUND' | 'MANUAL_ADJUST' | 'PENALTY';
  /** 排行类型 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 榜单周期类型 */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** 榜单范围类型 */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** 业务流水号 */
  bizNo?: string;
  /** 变更原因 */
  reason?: string;
  /** 积分变更前 */
  scoreBefore?: number;
  /** 积分变化 */
  scoreDelta?: number;
  /** 积分变更后 */
  scoreAfter?: number;
  /** 等级分变更前 */
  ratingBefore?: number;
  /** 等级分变化 */
  ratingDelta?: number;
  /** 等级分变更后 */
  ratingAfter?: number;
  /** 筹码变更前 */
  chipsBefore?: number;
  /** 筹码变化 */
  chipsDelta?: number;
  /** 筹码变更后 */
  chipsAfter?: number;
  /** 操作人用户ID */
  operatorUserId?: number;
  /** 发生时间 */
  occurredAt?: string;
  /** 结算附加数据 */
  settlementData?: Record<string, unknown>;
  /** 扩展数据 */
  extData?: Record<string, unknown>;
}
