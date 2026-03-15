/** 棋牌游戏战绩查询表单 */
export interface PlusGameRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 玩家用户ID，不传表示查询全量战绩 */
  userId?: number;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 俱乐部ID */
  clubId?: number;
  /** 座位号 */
  seatNo?: number;
  /** 是否获胜 */
  winner?: boolean;
  /** 是否逃跑 */
  escaped?: boolean;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 结果类型 */
  resultType?: 'PENDING' | 'WIN' | 'LOSE' | 'DRAW' | 'ESCAPE' | 'DISMISS';
}
