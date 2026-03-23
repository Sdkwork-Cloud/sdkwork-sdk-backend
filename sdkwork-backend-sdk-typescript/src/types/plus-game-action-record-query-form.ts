/** æ£çæ¸¸æå¨ä½æµæ°´æ¥è¯¢è¡¨å */
export interface PlusGameActionRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** ç©å®¶ç¨æ·ID */
  playerUserId?: number;
  /** å¨ä½ç±»å */
  actionType?: 'SYSTEM' | 'JOIN_ROOM' | 'LEAVE_ROOM' | 'READY' | 'CANCEL_READY' | 'START_MATCH' | 'MOVE' | 'PLACE' | 'CAPTURE' | 'DRAW_CARD' | 'PLAY_CARD' | 'DISCARD' | 'BID' | 'PASS' | 'CHI' | 'PENG' | 'GANG' | 'HU' | 'CHECK' | 'BET' | 'CALL' | 'RAISE' | 'FOLD' | 'ALL_IN' | 'TRUSTEESHIP' | 'UNDO' | 'SETTLEMENT' | 'CHAT';
  /** å¨ä½ç¼ç  */
  actionCode?: string;
}
