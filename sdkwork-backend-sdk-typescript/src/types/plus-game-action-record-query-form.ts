/** 棋牌游戏动作流水查询表单 */
export interface PlusGameActionRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 玩家用户ID */
  playerUserId?: number;
  /** 动作类型 */
  actionType?: 'SYSTEM' | 'JOIN_ROOM' | 'LEAVE_ROOM' | 'READY' | 'CANCEL_READY' | 'START_MATCH' | 'MOVE' | 'PLACE' | 'CAPTURE' | 'DRAW_CARD' | 'PLAY_CARD' | 'DISCARD' | 'BID' | 'PASS' | 'CHI' | 'PENG' | 'GANG' | 'HU' | 'CHECK' | 'BET' | 'CALL' | 'RAISE' | 'FOLD' | 'ALL_IN' | 'TRUSTEESHIP' | 'UNDO' | 'SETTLEMENT' | 'CHAT';
  /** 动作编码 */
  actionCode?: string;
}
