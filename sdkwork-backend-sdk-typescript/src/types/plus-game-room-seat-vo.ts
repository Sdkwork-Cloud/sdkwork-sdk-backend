/** 棋牌游戏房间座位VO */
export interface PlusGameRoomSeatVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 座位记录ID */
  seatId?: number;
  /** 房间ID */
  roomId?: number;
  /** 玩法定义ID */
  definitionId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩家用户ID */
  userId?: number;
  /** 座位号 */
  seatNo?: number;
  /** 座位状态 */
  status?: 'EMPTY' | 'RESERVED' | 'READY' | 'PLAYING' | 'ELIMINATED' | 'OFFLINE' | 'LEFT' | 'TRUSTEESHIP';
  /** 玩家类型 */
  playerType?: 'HUMAN' | 'AI' | 'BOT' | 'SPECTATOR';
  /** 昵称快照 */
  nicknameSnapshot?: string;
  /** 头像URL */
  avatarUrl?: string;
  /** 进入来源 */
  joinSource?: string;
  /** 队伍号 */
  teamNo?: number;
  /** 是否准备 */
  ready?: boolean;
  /** 是否托管 */
  trusteeship?: boolean;
  /** 是否旁观席 */
  spectator?: boolean;
  /** 房间内累计分 */
  roomScore?: number;
  /** 房间内筹码 */
  chips?: number;
  /** 淘汰名次 */
  eliminatedRankNo?: number;
  /** 入座时间 */
  joinedAt?: string;
  /** 淘汰时间 */
  eliminatedAt?: string;
  /** 离座时间 */
  leftAt?: string;
  /** 手牌/棋子快照 */
  handSnapshot?: Record<string, unknown>;
}
