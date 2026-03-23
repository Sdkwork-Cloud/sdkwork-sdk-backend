/** æ£çæ¸¸ææè¡æ¦æ¥è¯¢è¡¨å */
export interface PlusGameLeaderboardQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** æ¦åå½å±èå´ID */
  scopeOwnerId?: number;
  /** æè¡ç±»å */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** æ¦åå¨æç±»å */
  periodType?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON';
  /** æ¦åèå´ç±»å */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
}
