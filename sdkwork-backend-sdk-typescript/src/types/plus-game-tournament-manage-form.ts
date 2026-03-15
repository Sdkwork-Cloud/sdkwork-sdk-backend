/** 棋牌游戏赛事管理表单 */
export interface PlusGameTournamentManageForm {
  /** 赛事状态 */
  status?: 'DRAFT' | 'REGISTERING' | 'RUNNING' | 'SETTLING' | 'FINISHED' | 'CANCELED';
  /** 报名开始时间 */
  signUpStartAt?: string;
  /** 报名结束时间 */
  signUpEndAt?: string;
  /** 赛事开始时间 */
  startAt?: string;
  /** 赛事结束时间 */
  endAt?: string;
  /** 冠军用户ID */
  winnerUserId?: number;
  /** 冠军俱乐部ID */
  winnerClubId?: number;
}
