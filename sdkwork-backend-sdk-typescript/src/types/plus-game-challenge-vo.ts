/** 棋牌游戏挑战赛VO */
export interface PlusGameChallengeVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 挑战ID */
  challengeId?: number;
  /** 挑战编号 */
  challengeNo?: string;
  /** 擂台ID */
  arenaId?: number;
  /** 挑战来源 */
  sourceType?: 'SEARCH' | 'LEADERBOARD' | 'ARENA' | 'MANUAL';
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 挑战状态 */
  status?: 'PENDING' | 'ACCEPTED' | 'REJECTED' | 'CANCELED' | 'EXPIRED' | 'SETTLED';
  /** 挑战方用户ID */
  challengerUserId?: number;
  /** 被挑战方用户ID */
  targetUserId?: number;
  /** 获胜方用户ID */
  winnerUserId?: number;
  /** 失败方用户ID */
  loserUserId?: number;
  /** 单边押分 */
  stakeScore?: number;
  /** 挑战方已锁积分 */
  challengerStakeLocked?: number;
  /** 被挑战方已锁积分 */
  targetStakeLocked?: number;
  /** 来源榜单ID */
  leaderboardId?: number;
  /** 关联房间ID */
  roomId?: number;
  /** 关联对局ID */
  matchId?: number;
  /** 挑战备注 */
  reason?: string;
  /** 发起时间 */
  challengedAt?: string;
  /** 接受时间 */
  acceptedAt?: string;
  /** 结算时间 */
  settledAt?: string;
  /** 过期时间 */
  expiredAt?: string;
  /** 取消时间 */
  canceledAt?: string;
}
