/** 棋牌游戏战绩VO */
export interface PlusGameRecordVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 战绩ID */
  recordId?: number;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 赛季标识 */
  seasonKey?: string;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 座位号 */
  seatNo?: number;
  /** 队伍号 */
  teamNo?: number;
  /** 对局结果 */
  resultType?: 'PENDING' | 'WIN' | 'LOSE' | 'DRAW' | 'ESCAPE' | 'DISMISS';
  /** 名次 */
  rankNo?: number;
  /** 昵称快照 */
  nicknameSnapshot?: string;
  /** 头像URL */
  avatarUrl?: string;
  /** 是否胜者 */
  winner?: boolean;
  /** 是否逃跑 */
  escaped?: boolean;
  /** 是否计入榜单 */
  leaderboardEligible?: boolean;
  /** 动作数 */
  actionCount?: number;
  /** 有效动作数 */
  moveCount?: number;
  /** 赛前积分 */
  scoreBefore?: number;
  /** 积分变化 */
  scoreDelta?: number;
  /** 赛后积分 */
  scoreAfter?: number;
  /** 赛前等级分 */
  ratingBefore?: number;
  /** 等级分变化 */
  ratingDelta?: number;
  /** 赛后等级分 */
  ratingAfter?: number;
  /** 赛前筹码 */
  chipsBefore?: number;
  /** 筹码变化 */
  chipsDelta?: number;
  /** 赛后筹码 */
  chipsAfter?: number;
  /** 参与时间 */
  joinedAt?: string;
  /** 完成时间 */
  finishedAt?: string;
  /** 历史最佳名次快照 */
  bestRankSnapshot?: number;
  /** 玩家结算数据 */
  settlementData?: Record<string, Record<string, unknown>>;
  /** 荣誉快照 */
  honorSnapshot?: Record<string, Record<string, unknown>>;
}
