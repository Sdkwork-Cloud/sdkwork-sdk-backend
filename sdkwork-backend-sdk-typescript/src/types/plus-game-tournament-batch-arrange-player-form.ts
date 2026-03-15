/** 棋牌游戏赛事参赛者批量编排项 */
export interface PlusGameTournamentBatchArrangePlayerForm {
  /** 玩家用户ID */
  userId?: number;
  /** 显式种子位；为空时按批量规则自动续排 */
  seedNo?: number;
  /** 显式队伍号；为空时按批量规则自动续排 */
  teamNo?: number;
}
