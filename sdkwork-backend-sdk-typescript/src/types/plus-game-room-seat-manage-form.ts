/** æ£çæ¸¸ææ¿é´åº§ä½ç®¡çè¡¨å */
export interface PlusGameRoomSeatManageForm {
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** åº§ä½ç¶æ */
  status?: 'EMPTY' | 'RESERVED' | 'READY' | 'PLAYING' | 'ELIMINATED' | 'OFFLINE' | 'LEFT' | 'TRUSTEESHIP';
  /** ç©å®¶ç±»å */
  playerType?: 'HUMAN' | 'AI' | 'BOT' | 'SPECTATOR';
  /** æµç§°å¿«ç§ */
  nicknameSnapshot?: string;
  /** å¤´åURL */
  avatarUrl?: string;
  /** è¿å¥æ¥æº */
  joinSource?: string;
  /** éä¼å· */
  teamNo?: number;
  /** æ¯å¦åå¤ */
  ready?: boolean;
  /** æ¯å¦æç®¡ */
  trusteeship?: boolean;
  /** æ¯å¦æè§å¸­ */
  spectator?: boolean;
  /** æ¿é´åç´¯è®¡å */
  roomScore?: number;
  /** æ¿é´åç­¹ç  */
  chips?: number;
  /** æ·æ±°åæ¬¡ */
  eliminatedRankNo?: number;
}
