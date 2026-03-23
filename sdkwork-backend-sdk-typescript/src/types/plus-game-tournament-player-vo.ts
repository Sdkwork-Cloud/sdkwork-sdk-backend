/** æ£çæ¸¸æèµäºåèµèVO */
export interface PlusGameTournamentPlayerVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** åèµè®°å½ID */
  playerId?: number;
  /** èµäºID */
  tournamentId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** éä¼å· */
  teamNo?: number;
  /** åèµç¶æ */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** ç§å­ä½ */
  seedNo?: number;
  /** æç»åæ¬¡ */
  rankNo?: number;
  /** æµç§°å¿«ç§ */
  nicknameSnapshot?: string;
  /** å¤´åURL */
  avatarUrl?: string;
  /** èµäºæç»©å¼ */
  scoreValue?: number;
  /** èµäºææå¯¹å±æ° */
  totalMatchCount?: number;
  /** èåºæ° */
  winCount?: number;
  /** è´åºæ° */
  loseCount?: number;
  /** æ¥åæ¶é´ */
  registeredAt?: string;
  /** ç­¾å°æ¶é´ */
  checkedInAt?: string;
  /** å®èµæ¶é´ */
  finishedAt?: string;
}
