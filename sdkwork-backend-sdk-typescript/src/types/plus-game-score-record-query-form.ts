/** æ£çæ¸¸æç§¯åæµæ°´æ¥è¯¢è¡¨å */
export interface PlusGameScoreRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** ç§¯ååæ´ç±»å */
  changeType?: 'MATCH_SETTLEMENT' | 'ROUND_SETTLEMENT' | 'TOURNAMENT_REWARD' | 'RANKING_REWARD' | 'CHALLENGE_STAKE' | 'CHALLENGE_REFUND' | 'CHALLENGE_REWARD' | 'ARENA_STAKE' | 'ARENA_REFUND' | 'ARENA_REWARD' | 'ROOM_REFUND' | 'MANUAL_ADJUST' | 'PENALTY';
  /** èµäºID */
  tournamentId?: number;
  /** æ¿é´ID */
  roomId?: number;
  /** å¯¹å±ID */
  matchId?: number;
  /** æ¦åID */
  leaderboardId?: number;
  /** ä¸å¡æµæ°´å· */
  bizNo?: string;
  /** æä½äººç¨æ·ID */
  operatorUserId?: number;
}
