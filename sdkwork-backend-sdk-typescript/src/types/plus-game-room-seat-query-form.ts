/** 棋牌游戏房间座位查询表单 */
export interface PlusGameRoomSeatQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 房间ID */
  roomId?: number;
  /** 玩家用户ID */
  userId?: number;
  /** 座位状态 */
  status?: 'EMPTY' | 'RESERVED' | 'READY' | 'PLAYING' | 'ELIMINATED' | 'OFFLINE' | 'LEFT' | 'TRUSTEESHIP';
}
