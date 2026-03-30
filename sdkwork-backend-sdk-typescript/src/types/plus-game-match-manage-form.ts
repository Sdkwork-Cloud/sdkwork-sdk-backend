/** 棋牌游戏对局管理表单 */
export interface PlusGameMatchManageForm {
  /** 对局状态 */
  status?: 'CREATED' | 'RUNNING' | 'PAUSED' | 'SETTLING' | 'FINISHED' | 'ABORTED';
  /** 当前轮次 */
  currentRoundNo?: number;
  /** 最大轮次 */
  maxRoundCount?: number;
  /** 当前行动座位号 */
  currentTurnSeatNo?: number;
  /** 庄家/先手座位号 */
  dealerSeatNo?: number;
  /** 获胜座位号 */
  winnerSeatNo?: number;
  /** 获胜用户ID */
  winnerUserId?: number;
  /** 是否计入榜单 */
  leaderboardEligible?: boolean;
  /** 是否计入统计 */
  validForStats?: boolean;
  /** 是否确认结果 */
  resultConfirmed?: boolean;
  /** 是否异常结束 */
  abnormalFinished?: boolean;
  /** 异常或无效原因 */
  invalidReason?: string;
}
