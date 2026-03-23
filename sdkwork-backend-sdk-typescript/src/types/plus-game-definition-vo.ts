/** æ£çæ¸¸æç©æ³å®ä¹VO */
export interface PlusGameDefinitionVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç©æ³å®ä¹ID */
  definitionId?: number;
  /** ç©æ³ç¼ç  */
  code?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³åç±» */
  category?: 'BOARD' | 'CARD' | 'TILE' | 'MIXED';
  /** ç©æ³åç§° */
  name?: string;
  /** ç©æ³å«å */
  alias?: string;
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** ç©æ³æè¿° */
  description?: string;
  /** è§åæè¦ */
  ruleSummary?: string;
  /** æå°ç©å®¶æ° */
  minPlayers?: number;
  /** æå¤ç©å®¶æ° */
  maxPlayers?: number;
  /** åº§ä½æ° */
  seatCount?: number;
  /** éä¼æ° */
  teamCount?: number;
  /** é»è®¤å±æ° */
  defaultRoundCount?: number;
  /** æ¯å¦ååå¶ */
  turnBased?: boolean;
  /** æ¯å¦æ¯ææä½ */
  ranked?: boolean;
  /** æ¯å¦æ¯ææè§ */
  supportsSpectator?: boolean;
  /** æ¯å¦æ¯ææç®¡ */
  supportsTrusteeship?: boolean;
  /** æ¯å¦æ¯ææºå¨äºº */
  supportsRobot?: boolean;
  /** æ¯å¦æ¯æåæ¾ */
  supportsReplay?: boolean;
  /** æ¯å¦æ¯æå¥½åæ¿ */
  supportsFriendRoom?: boolean;
  /** æ¯å¦æ¯æèµäº */
  supportsTournament?: boolean;
  /** æ¯å¦æ¯æä¿±ä¹é¨ */
  supportsClub?: boolean;
  /** æ¯å¦æ¯æç»ä¹ æ¨¡å¼ */
  supportsPractice?: boolean;
  /** æ¨èé¾åº¦ç­çº§ */
  difficultyLevel?: number;
  /** æç¨é¾æ¥ */
  tutorialUrl?: string;
  /** é»è®¤æè¡ç±»å */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** é»è®¤è§åéç½® */
  defaultRuleConfig?: Record<string, unknown>;
  /** æ©å±åæ°æ® */
  metadata?: Record<string, unknown>;
  /** æ¯æçæ¦åå¨æ */
  supportedLeaderboardPeriods?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON'[];
  /** æ¯å¦å¯ç¨ */
  enabled?: boolean;
}
