/** æ£çæ¸¸ææå°ç®¡çè¡¨å */
export interface PlusGameArenaManageForm {
  /** åå»ºæä¸»ç¨æ·IDï¼å¼ææ¶å¿å¡« */
  ownerUserId?: number;
  /** å½åæä¸»ç¨æ·ID */
  currentChampionUserId?: number;
  /** ç©æ³ç±»åï¼å¼ææ¶å¿å¡« */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** æå°ç¶æ */
  status?: 'OPEN' | 'LOCKED' | 'CLOSED';
  /** æå°åç§° */
  name?: string;
  /** æå°æè¿° */
  description?: string;
  /** æå°æ¼å */
  stakeScore?: number;
  /** å³èæ¿é´ID */
  roomId?: number;
  /** å³èå¯¹å±ID */
  matchId?: number;
  /** å¤çå¤æ³¨ */
  reason?: string;
}
