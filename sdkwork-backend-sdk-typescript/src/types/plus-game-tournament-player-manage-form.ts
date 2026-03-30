/** 棋牌游戏赛事参赛者管理表单 */
export interface PlusGameTournamentPlayerManageForm {
  /** 参赛状态 */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** 种子位 */
  seedNo?: number;
  /** 最终名次 */
  rankNo?: number;
  /** 队伍号 */
  teamNo?: number;
  /** 赛事成绩值 */
  scoreValue?: number;
  /** 赛事有效对局数 */
  totalMatchCount?: number;
  /** 胜场数 */
  winCount?: number;
  /** 负场数 */
  loseCount?: number;
}
