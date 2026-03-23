/** æ£çæ¸¸æææèµVO */
export interface PlusGameChallengeVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ææID */
  challengeId?: number;
  /** ææç¼å· */
  challengeNo?: string;
  /** æå°ID */
  arenaId?: number;
  /** æææ¥æº */
  sourceType?: 'SEARCH' | 'LEADERBOARD' | 'ARENA' | 'MANUAL';
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** ææç¶æ */
  status?: 'PENDING' | 'ACCEPTED' | 'REJECTED' | 'CANCELED' | 'EXPIRED' | 'SETTLED';
  /** æææ¹ç¨æ·ID */
  challengerUserId?: number;
  /** è¢«æææ¹ç¨æ·ID */
  targetUserId?: number;
  /** è·èæ¹ç¨æ·ID */
  winnerUserId?: number;
  /** å¤±è´¥æ¹ç¨æ·ID */
  loserUserId?: number;
  /** åè¾¹æ¼å */
  stakeScore?: number;
  /** æææ¹å·²éç§¯å */
  challengerStakeLocked?: number;
  /** è¢«æææ¹å·²éç§¯å */
  targetStakeLocked?: number;
  /** æ¥æºæ¦åID */
  leaderboardId?: number;
  /** å³èæ¿é´ID */
  roomId?: number;
  /** å³èå¯¹å±ID */
  matchId?: number;
  /** ææå¤æ³¨ */
  reason?: string;
  /** åèµ·æ¶é´ */
  challengedAt?: string;
  /** æ¥åæ¶é´ */
  acceptedAt?: string;
  /** ç»ç®æ¶é´ */
  settledAt?: string;
  /** è¿ææ¶é´ */
  expiredAt?: string;
  /** åæ¶æ¶é´ */
  canceledAt?: string;
}
