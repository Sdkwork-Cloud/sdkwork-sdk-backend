/** æ£çæ¸¸æåæ¾VO */
export interface PlusGameReplayVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** åæ¾ID */
  replayId?: number;
  /** åæ¾ç¼å· */
  replayNo?: string;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** åæ¾å½å±ç¨æ·ID */
  ownerUserId?: number;
  /** åæ¾æ é¢ */
  title?: string;
  /** åæ¾ç¶æ */
  status?: 'GENERATING' | 'READY' | 'EXPIRED' | 'DELETED';
  /** æ¯å¦å¬å¼å¯è§ */
  publicVisible?: boolean;
  /** æ¯å¦åè®¸åäº« */
  allowShare?: boolean;
  /** åæ¾æ¶é¿ */
  durationSeconds?: number;
  /** å¨ä½æ»æ° */
  actionCount?: number;
  /** å³é®å¸§æ°é */
  keyFrameCount?: number;
  /** åæ¾å­å¨é® */
  storageKey?: string;
  /** å°é¢å°å */
  coverUrl?: string;
  /** åå§å±é¢å¿«ç§ */
  boardSnapshot?: Record<string, unknown>;
  /** å³é®å¸§æè¦ */
  keyFrames?: Record<string, unknown>;
  /** å¼å§æ¶é´ */
  startedAt?: string;
  /** ç»ææ¶é´ */
  endedAt?: string;
  /** è¿ææ¶é´ */
  expiredAt?: string;
}
