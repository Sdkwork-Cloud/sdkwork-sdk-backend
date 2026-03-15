/** 棋牌游戏挑战赛管理表单 */
export interface PlusGameChallengeManageForm {
  /** 挑战状态 */
  status?: 'PENDING' | 'ACCEPTED' | 'REJECTED' | 'CANCELED' | 'EXPIRED' | 'SETTLED';
  /** 获胜方用户ID，仅结算时使用 */
  winnerUserId?: number;
  /** 关联房间ID */
  roomId?: number;
  /** 关联对局ID */
  matchId?: number;
  /** 处理备注 */
  reason?: string;
}
