/** æ£çæ¸¸ææ¿é´VO */
export interface PlusGameRoomVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æ¿é´ID */
  roomId?: number;
  /** æ¿ä¸»ç¨æ·ID */
  userId?: number;
  /** ç©æ³å®ä¹ID */
  definitionId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** æ¿é´å· */
  roomNo?: string;
  /** æ¿é´åç§° */
  name?: string;
  /** æ¿é´ç±»å */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** æ¿é´ç¶æ */
  status?: 'WAITING' | 'READY' | 'PLAYING' | 'SETTLING' | 'FINISHED' | 'DISMISSED' | 'EXPIRED';
  /** æ¿é´å¯è§æ§ */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'PASSWORD';
  /** åº§ä½æ° */
  seatCount?: number;
  /** å½åç©å®¶æ° */
  currentPlayerCount?: number;
  /** å¼å±æå°äººæ° */
  minStartPlayerCount?: number;
  /** æ¿ä¸»åº§ä½å· */
  hostSeatNo?: number;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** å½åå¯¹å±ID */
  currentMatchId?: number;
  /** å½åå±æ° */
  currentRoundNo?: number;
  /** è®¡åæ»å±æ° */
  plannedRoundCount?: number;
  /** å·²å®æå±æ° */
  finishedRoundCount?: number;
  /** æ¯å¦æä½æ¿ */
  ranked?: boolean;
  /** æ¯å¦åè®¸æè§ */
  allowSpectator?: boolean;
  /** æ¯å¦åè®¸æºå¨äºº */
  allowRobot?: boolean;
  /** æ¯å¦åè®¸æç®¡ */
  allowTrusteeship?: boolean;
  /** æ¯å¦è®¡å¥æ¦å */
  leaderboardEligible?: boolean;
  /** æ¯å¦å¯ç¨åæ¾ */
  replayEnabled?: boolean;
  /** è§æäººæ° */
  spectatorCount?: number;
  /** éè¯·ç  */
  inviteCode?: string;
  /** æ¿é´è§åéç½® */
  ruleConfig?: Record<string, unknown>;
  /** æ©å±æ°æ® */
  extData?: Record<string, unknown>;
  /** å¼å§æ¶é´ */
  startedAt?: string;
  /** ç»ææ¶é´ */
  endedAt?: string;
  /** æåæ´»è·æ¶é´ */
  lastActiveAt?: string;
}
