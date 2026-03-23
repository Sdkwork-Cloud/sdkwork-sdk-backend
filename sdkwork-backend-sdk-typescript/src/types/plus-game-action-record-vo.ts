/** æ£çæ¸¸æå¨ä½æµæ°´VO */
export interface PlusGameActionRecordVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å¨ä½æµæ°´ID */
  actionId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** è½®æ¬¡ID */
  roundId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** åæ¾ID */
  replayId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** ç©å®¶ç¨æ·ID */
  playerUserId?: number;
  /** åº§ä½å· */
  seatNo?: number;
  /** ç©å®¶ç±»å */
  playerType?: 'HUMAN' | 'AI' | 'BOT' | 'SPECTATOR';
  /** æµæ°´åºå· */
  seqNo?: number;
  /** åååºå· */
  turnNo?: number;
  /** é¶æ®µåç§° */
  phaseName?: string;
  /** å¨ä½ç±»å */
  actionType?: 'SYSTEM' | 'JOIN_ROOM' | 'LEAVE_ROOM' | 'READY' | 'CANCEL_READY' | 'START_MATCH' | 'MOVE' | 'PLACE' | 'CAPTURE' | 'DRAW_CARD' | 'PLAY_CARD' | 'DISCARD' | 'BID' | 'PASS' | 'CHI' | 'PENG' | 'GANG' | 'HU' | 'CHECK' | 'BET' | 'CALL' | 'RAISE' | 'FOLD' | 'ALL_IN' | 'TRUSTEESHIP' | 'UNDO' | 'SETTLEMENT' | 'CHAT';
  /** å¨ä½ç¼ç  */
  actionCode?: string;
  /** æ åè®°è°± */
  notation?: string;
  /** ç®æ åº§ä½å· */
  targetSeatNo?: number;
  /** èµ·å§ä½ç½® */
  sourcePosition?: string;
  /** ç®æ ä½ç½® */
  targetPosition?: string;
  /** èæ¶æ¯«ç§ */
  consumeMillis?: number;
  /** æ¯å¦ææå¨ä½ */
  validAction?: boolean;
  /** æ¯å¦ç³»ç»å¨ä½ */
  systemAction?: boolean;
  /** æ¯å¦è¶æ¶å¨ä½ */
  timeoutAction?: boolean;
  /** å¨ä½åçæ¶é´ */
  actionAt?: string;
  /** å¨ä½è½½è· */
  actionPayload?: Record<string, unknown>;
  /** å¨ä½åç¶æ */
  beforeState?: Record<string, unknown>;
  /** å¨ä½åç¶æ */
  afterState?: Record<string, unknown>;
}
