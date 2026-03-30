import type { PlusGameTournamentBatchArrangePlayerForm } from './plus-game-tournament-batch-arrange-player-form';

/** 棋牌游戏赛事参赛者批量编排表单 */
export interface PlusGameTournamentBatchArrangeForm {
  /** 用户ID集合；为空表示对赛事下全部参赛者执行 */
  userIds?: number[];
  /** 显式编排项列表；按列表顺序编排，存在时优先生效 */
  arrangePlayers?: PlusGameTournamentBatchArrangePlayerForm[];
  /** 种子位起始值；为空时自动衔接现有最大种子位 */
  seedNoStart?: number;
  /** 队伍号起始值 */
  teamNoStart?: number;
  /** 每组人数，用于自动编排队伍号 */
  groupSize?: number;
  /** 是否覆盖已有种子位 */
  overwriteExistingSeedNo?: boolean;
  /** 是否覆盖已有队伍号 */
  overwriteExistingTeamNo?: boolean;
}
