/** æ£çæ¸¸æææèµæ¥è¯¢è¡¨å */
export interface PlusGameChallengeQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** æææ¹ç¨æ·ID */
  challengerUserId?: number;
  /** è¢«æææ¹ç¨æ·ID */
  targetUserId?: number;
  /** æå°ID */
  arenaId?: number;
  /** è·èæ¹ç¨æ·ID */
  winnerUserId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ææç¶æ */
  status?: 'PENDING' | 'ACCEPTED' | 'REJECTED' | 'CANCELED' | 'EXPIRED' | 'SETTLED';
  /** æææ¥æº */
  sourceType?: 'SEARCH' | 'LEADERBOARD' | 'ARENA' | 'MANUAL';
}
