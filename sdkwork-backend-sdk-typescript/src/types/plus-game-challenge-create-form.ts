/** 棋牌游戏挑战赛创建表单 */
export interface PlusGameChallengeCreateForm {
  /** 挑战方用户ID */
  challengerUserId?: number;
  /** 被挑战方用户ID；擂台挑战可为空 */
  targetUserId?: number;
  /** 玩法类型；擂台挑战可为空并继承擂台玩法 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 单边押分 */
  stakeScore?: number;
  /** 挑战来源 */
  sourceType?: 'SEARCH' | 'LEADERBOARD' | 'ARENA' | 'MANUAL';
  /** 擂台ID */
  arenaId?: number;
  /** 来源榜单ID */
  leaderboardId?: number;
  /** 挑战备注 */
  reason?: string;
}
