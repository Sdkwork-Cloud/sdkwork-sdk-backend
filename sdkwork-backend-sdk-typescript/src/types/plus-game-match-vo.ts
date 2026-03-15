/** 棋牌游戏对局VO */
export interface PlusGameMatchVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 对局ID */
  matchId?: number;
  /** 玩法定义ID */
  definitionId?: number;
  /** 房间ID */
  roomId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 赛季标识 */
  seasonKey?: string;
  /** 对局编号 */
  matchNo?: string;
  /** 房间类型 */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** 对局状态 */
  status?: 'CREATED' | 'RUNNING' | 'PAUSED' | 'SETTLING' | 'FINISHED' | 'ABORTED';
  /** 是否排位对局 */
  ranked?: boolean;
  /** 玩家总数 */
  totalPlayerCount?: number;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 当前轮次 */
  currentRoundNo?: number;
  /** 计划总轮次 */
  maxRoundCount?: number;
  /** 当前行动座位 */
  currentTurnSeatNo?: number;
  /** 庄家/先手座位 */
  dealerSeatNo?: number;
  /** 获胜座位 */
  winnerSeatNo?: number;
  /** 获胜用户ID */
  winnerUserId?: number;
  /** 回放ID */
  replayId?: number;
  /** 动作总数 */
  actionCount?: number;
  /** 有效动作数 */
  moveCount?: number;
  /** 是否计入榜单 */
  leaderboardEligible?: boolean;
  /** 是否计入统计 */
  validForStats?: boolean;
  /** 结果是否已确认 */
  resultConfirmed?: boolean;
  /** 是否异常结束 */
  abnormalFinished?: boolean;
  /** 异常原因 */
  invalidReason?: string;
  /** 开始时间 */
  startedAt?: string;
  /** 结算时间 */
  settledAt?: string;
  /** 结束时间 */
  endedAt?: string;
  /** 持续秒数 */
  durationSeconds?: number;
}
