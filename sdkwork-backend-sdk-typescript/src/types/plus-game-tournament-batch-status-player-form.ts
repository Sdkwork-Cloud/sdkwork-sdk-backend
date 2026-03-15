/** 棋牌游戏赛事参赛者批量状态项 */
export interface PlusGameTournamentBatchStatusPlayerForm {
  /** 玩家用户ID */
  userId?: number;
  /** 玩家状态；为空时继承批量默认状态 */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** 显式名次；仅淘汰/完赛状态允许填写 */
  rankNo?: number;
  /** 赛事成绩值 */
  scoreValue?: number;
  /** 赛事有效对局数 */
  totalMatchCount?: number;
  /** 胜场数 */
  winCount?: number;
  /** 负场数 */
  loseCount?: number;
}
