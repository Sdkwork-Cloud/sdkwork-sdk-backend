/** æ£çæ¸¸ææ¿é´åº§ä½æ¥è¯¢è¡¨å */
export interface PlusGameRoomSeatQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** æ¿é´ID */
  roomId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** åº§ä½ç¶æ */
  status?: 'EMPTY' | 'RESERVED' | 'READY' | 'PLAYING' | 'ELIMINATED' | 'OFFLINE' | 'LEFT' | 'TRUSTEESHIP';
}
