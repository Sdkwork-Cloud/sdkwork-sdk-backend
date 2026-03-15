/** 棋牌游戏赛事参赛者VO */
export interface PlusGameTournamentPlayerVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 参赛记录ID */
  playerId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 俱乐部ID */
  clubId?: number;
  /** 队伍号 */
  teamNo?: number;
  /** 参赛状态 */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** 种子位 */
  seedNo?: number;
  /** 最终名次 */
  rankNo?: number;
  /** 昵称快照 */
  nicknameSnapshot?: string;
  /** 头像URL */
  avatarUrl?: string;
  /** 赛事成绩值 */
  scoreValue?: number;
  /** 赛事有效对局数 */
  totalMatchCount?: number;
  /** 胜场数 */
  winCount?: number;
  /** 负场数 */
  loseCount?: number;
  /** 报名时间 */
  registeredAt?: string;
  /** 签到时间 */
  checkedInAt?: string;
  /** 完赛时间 */
  finishedAt?: string;
}
