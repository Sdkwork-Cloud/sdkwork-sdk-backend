/** æ£çæ¸¸æèµäºVO */
export interface PlusGameTournamentVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** èµäºID */
  tournamentId?: number;
  /** èµäºç¼å· */
  tournamentNo?: string;
  /** èµäºåç§° */
  name?: string;
  /** èµäºç®ç§° */
  shortName?: string;
  /** èµäºæè¿° */
  description?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç©æ³æ¨¡å¼ç¼ç  */
  gameModeCode?: string;
  /** èµäºç±»å */
  tournamentType?: 'LADDER' | 'CHALLENGE' | 'KNOCKOUT' | 'ROUND_ROBIN' | 'TEAM' | 'FESTIVAL';
  /** èµäºç¶æ */
  status?: 'DRAFT' | 'REGISTERING' | 'RUNNING' | 'SETTLING' | 'FINISHED' | 'CANCELED';
  /** ç»ç»èç¨æ·ID */
  organizerUserId?: number;
  /** ä¿±ä¹é¨ID */
  clubId?: number;
  /** èµå­£æ è¯ */
  seasonKey?: string;
  /** å°åºç¼ç  */
  regionCode?: string;
  /** æå°ç©å®¶äººæ° */
  minPlayerCount?: number;
  /** æå¤ç©å®¶äººæ° */
  maxPlayerCount?: number;
  /** éä¼è§æ¨¡ */
  teamSize?: number;
  /** æ¯å¦éè¦æ¥å */
  registrationRequired?: boolean;
  /** æ¯å¦æä½èµäº */
  ranked?: boolean;
  /** æ¯å¦å¯ç¨åæ¾ */
  replayEnabled?: boolean;
  /** æ¥åå¼å§æ¶é´ */
  signUpStartAt?: string;
  /** æ¥åç»ææ¶é´ */
  signUpEndAt?: string;
  /** å¼å§æ¶é´ */
  startAt?: string;
  /** ç»ææ¶é´ */
  endAt?: string;
  /** å åç¨æ·ID */
  winnerUserId?: number;
  /** å åä¿±ä¹é¨ID */
  winnerClubId?: number;
  /** æ»åèµäººæ° */
  totalParticipantCount?: number;
  /** æ»å¯¹å±æ° */
  totalMatchCount?: number;
  /** å·²æ¥åäººæ° */
  registeredCount?: number;
  /** å·²ç­¾å°äººæ° */
  checkedInCount?: number;
  /** æ¯èµä¸­äººæ° */
  playingCount?: number;
  /** å·²æçº§äººæ° */
  advancedCount?: number;
  /** å·²æ·æ±°äººæ° */
  eliminatedCount?: number;
  /** å·²å®èµäººæ° */
  finishedCount?: number;
  /** å·²éèµäººæ° */
  withdrawnCount?: number;
}
