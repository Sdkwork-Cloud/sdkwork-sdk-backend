/** 棋牌游戏赛事参赛者查询表单 */
export interface PlusGameTournamentPlayerQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 赛事ID */
  tournamentId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 参赛状态 */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
}
