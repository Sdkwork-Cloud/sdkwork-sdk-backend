/** æ£çæ¸¸æææèµåå»ºè¡¨å */
export interface PlusGameChallengeCreateForm {
  /** æææ¹ç¨æ·ID */
  challengerUserId?: number;
  /** è¢«æææ¹ç¨æ·IDï¼æå°ææå¯ä¸ºç©º */
  targetUserId?: number;
  /** ç©æ³ç±»åï¼æå°ææå¯ä¸ºç©ºå¹¶ç»§æ¿æå°ç©æ³ */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** åè¾¹æ¼å */
  stakeScore?: number;
  /** æææ¥æº */
  sourceType?: 'SEARCH' | 'LEADERBOARD' | 'ARENA' | 'MANUAL';
  /** æå°ID */
  arenaId?: number;
  /** æ¥æºæ¦åID */
  leaderboardId?: number;
  /** ææå¤æ³¨ */
  reason?: string;
}
