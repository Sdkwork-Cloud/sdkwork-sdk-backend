/** æ£çæ¸¸ææ¿é´åº§ä½VO */
export interface PlusGameRoomSeatVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** åº§ä½è®°å½ID */
  seatId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** ç©æ³å®ä¹ID */
  definitionId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** åº§ä½å· */
  seatNo?: number;
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
  /** å¥åº§æ¶é´ */
  joinedAt?: string;
  /** æ·æ±°æ¶é´ */
  eliminatedAt?: string;
  /** ç¦»åº§æ¶é´ */
  leftAt?: string;
  /** æç/æ£å­å¿«ç§ */
  handSnapshot?: Record<string, unknown>;
}
