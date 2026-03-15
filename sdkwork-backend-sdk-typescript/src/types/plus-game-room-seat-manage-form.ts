/** 棋牌游戏房间座位管理表单 */
export interface PlusGameRoomSeatManageForm {
  /** 玩家用户ID */
  userId?: number;
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
}
