/** 棋牌游戏挑战赛查询表单 */
export interface PlusGameChallengeQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 挑战方用户ID */
  challengerUserId?: number;
  /** 被挑战方用户ID */
  targetUserId?: number;
  /** 擂台ID */
  arenaId?: number;
  /** 获胜方用户ID */
  winnerUserId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 挑战状态 */
  status?: 'PENDING' | 'ACCEPTED' | 'REJECTED' | 'CANCELED' | 'EXPIRED' | 'SETTLED';
  /** 挑战来源 */
  sourceType?: 'SEARCH' | 'LEADERBOARD' | 'ARENA' | 'MANUAL';
}
