/** 棋牌游戏积分流水查询表单 */
export interface PlusGameScoreRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 玩家用户ID */
  userId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 积分变更类型 */
  changeType?: 'MATCH_SETTLEMENT' | 'ROUND_SETTLEMENT' | 'TOURNAMENT_REWARD' | 'RANKING_REWARD' | 'CHALLENGE_STAKE' | 'CHALLENGE_REFUND' | 'CHALLENGE_REWARD' | 'ARENA_STAKE' | 'ARENA_REFUND' | 'ARENA_REWARD' | 'ROOM_REFUND' | 'MANUAL_ADJUST' | 'PENALTY';
  /** 赛事ID */
  tournamentId?: number;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 榜单ID */
  leaderboardId?: number;
  /** 业务流水号 */
  bizNo?: string;
  /** 操作人用户ID */
  operatorUserId?: number;
}
