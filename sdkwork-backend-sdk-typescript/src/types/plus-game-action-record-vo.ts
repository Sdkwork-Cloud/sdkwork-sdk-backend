/** 棋牌游戏动作流水VO */
export interface PlusGameActionRecordVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 动作流水ID */
  actionId?: number;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 轮次ID */
  roundId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 房间类型 */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** 回放ID */
  replayId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 玩家用户ID */
  playerUserId?: number;
  /** 座位号 */
  seatNo?: number;
  /** 玩家类型 */
  playerType?: 'HUMAN' | 'AI' | 'BOT' | 'SPECTATOR';
  /** 流水序号 */
  seqNo?: number;
  /** 回合序号 */
  turnNo?: number;
  /** 阶段名称 */
  phaseName?: string;
  /** 动作类型 */
  actionType?: 'SYSTEM' | 'JOIN_ROOM' | 'LEAVE_ROOM' | 'READY' | 'CANCEL_READY' | 'START_MATCH' | 'MOVE' | 'PLACE' | 'CAPTURE' | 'DRAW_CARD' | 'PLAY_CARD' | 'DISCARD' | 'BID' | 'PASS' | 'CHI' | 'PENG' | 'GANG' | 'HU' | 'CHECK' | 'BET' | 'CALL' | 'RAISE' | 'FOLD' | 'ALL_IN' | 'TRUSTEESHIP' | 'UNDO' | 'SETTLEMENT' | 'CHAT';
  /** 动作编码 */
  actionCode?: string;
  /** 标准记谱 */
  notation?: string;
  /** 目标座位号 */
  targetSeatNo?: number;
  /** 起始位置 */
  sourcePosition?: string;
  /** 目标位置 */
  targetPosition?: string;
  /** 耗时毫秒 */
  consumeMillis?: number;
  /** 是否有效动作 */
  validAction?: boolean;
  /** 是否系统动作 */
  systemAction?: boolean;
  /** 是否超时动作 */
  timeoutAction?: boolean;
  /** 动作发生时间 */
  actionAt?: string;
  /** 动作载荷 */
  actionPayload?: Record<string, Record<string, unknown>>;
  /** 动作前状态 */
  beforeState?: Record<string, Record<string, unknown>>;
  /** 动作后状态 */
  afterState?: Record<string, Record<string, unknown>>;
}
