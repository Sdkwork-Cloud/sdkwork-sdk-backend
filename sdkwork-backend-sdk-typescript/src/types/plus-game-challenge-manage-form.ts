/** æ£çæ¸¸æææèµç®¡çè¡¨å */
export interface PlusGameChallengeManageForm {
  /** ææç¶æ */
  status?: 'PENDING' | 'ACCEPTED' | 'REJECTED' | 'CANCELED' | 'EXPIRED' | 'SETTLED';
  /** è·èæ¹ç¨æ·IDï¼ä»ç»ç®æ¶ä½¿ç¨ */
  winnerUserId?: number;
  /** å³èæ¿é´ID */
  roomId?: number;
  /** å³èå¯¹å±ID */
  matchId?: number;
  /** å¤çå¤æ³¨ */
  reason?: string;
}
