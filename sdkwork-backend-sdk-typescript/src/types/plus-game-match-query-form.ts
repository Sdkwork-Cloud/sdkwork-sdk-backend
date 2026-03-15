/** 棋牌游戏对局查询表单 */
export interface PlusGameMatchQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
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
  /** 对局编号模糊匹配 */
  matchNoLike?: string;
  /** 房间类型 */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** 对局状态 */
  status?: 'CREATED' | 'RUNNING' | 'PAUSED' | 'SETTLING' | 'FINISHED' | 'ABORTED';
  /** 是否排位对局 */
  ranked?: boolean;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 获胜用户ID */
  winnerUserId?: number;
  /** 回放ID */
  replayId?: number;
  /** 是否计入榜单 */
  leaderboardEligible?: boolean;
  /** 是否计入统计 */
  validForStats?: boolean;
  /** 是否已确认结果 */
  resultConfirmed?: boolean;
  /** 是否异常结束 */
  abnormalFinished?: boolean;
}
