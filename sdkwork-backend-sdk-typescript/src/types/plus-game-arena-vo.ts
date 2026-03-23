/** æ£çæ¸¸ææå°VO */
export interface PlusGameArenaVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æå°ID */
  arenaId?: number;
  /** æå°ç¼å· */
  arenaNo?: string;
  /** æå°åç§° */
  name?: string;
  /** æå°æè¿° */
  description?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** æå°ç¶æ */
  status?: 'OPEN' | 'LOCKED' | 'CLOSED';
  /** åå»ºæä¸»ç¨æ·ID */
  ownerUserId?: number;
  /** å½åæä¸»ç¨æ·ID */
  currentChampionUserId?: number;
  /** å½åè¿è¡ä¸­ææID */
  currentChallengeId?: number;
  /** æå°æ¼å */
  stakeScore?: number;
  /** æ»æææ¬¡æ° */
  totalChallengeCount?: number;
  /** å®ææåæ¬¡æ° */
  successfulDefenseCount?: number;
  /** å®æå¤±è´¥æ¬¡æ° */
  failedDefenseCount?: number;
  /** å½åå®æè¿è */
  currentDefenseStreak?: number;
  /** æä½³å®æè¿è */
  bestDefenseStreak?: number;
  /** ç´¯è®¡å¥å±ç§¯å */
  totalRewardScore?: number;
  /** å³èæ¿é´ID */
  roomId?: number;
  /** å³èå¯¹å±ID */
  matchId?: number;
  /** å¼ææ¶é´ */
  openedAt?: string;
  /** æè¿æææ¶é´ */
  lastChallengeAt?: string;
  /** æè¿ç»ç®æ¶é´ */
  lastSettledAt?: string;
  /** å³é­æ¶é´ */
  closedAt?: string;
}
