import type { PlusGameTournamentBatchStatusPlayerForm } from './plus-game-tournament-batch-status-player-form';

/** 棋牌游戏赛事参赛者批量状态管理表单 */
export interface PlusGameTournamentBatchStatusForm {
  /** 用户ID集合；为空表示对赛事下全部参赛者执行 */
  userIds?: number[];
  /** 逐玩家状态项列表；存在时按列表顺序处理，并优先于 userIds */
  playerItems?: PlusGameTournamentBatchStatusPlayerForm[];
  /** 批量默认参赛状态；逐玩家项未设置状态时回退使用 */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** 起始名次，仅在淘汰/完赛且未显式设置名次时按顺序回填 */
  startRankNo?: number;
}
