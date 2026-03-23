/** æ£çæ¸¸æå¯¹å±ç®¡çè¡¨å */
export interface PlusGameMatchManageForm {
  /** å¯¹å±ç¶æ */
  status?: 'CREATED' | 'RUNNING' | 'PAUSED' | 'SETTLING' | 'FINISHED' | 'ABORTED';
  /** å½åè½®æ¬¡ */
  currentRoundNo?: number;
  /** æå¤§è½®æ¬¡ */
  maxRoundCount?: number;
  /** å½åè¡å¨åº§ä½å· */
  currentTurnSeatNo?: number;
  /** åºå®¶/åæåº§ä½å· */
  dealerSeatNo?: number;
  /** è·èåº§ä½å· */
  winnerSeatNo?: number;
  /** è·èç¨æ·ID */
  winnerUserId?: number;
  /** æ¯å¦è®¡å¥æ¦å */
  leaderboardEligible?: boolean;
  /** æ¯å¦è®¡å¥ç»è®¡ */
  validForStats?: boolean;
  /** æ¯å¦ç¡®è®¤ç»æ */
  resultConfirmed?: boolean;
  /** æ¯å¦å¼å¸¸ç»æ */
  abnormalFinished?: boolean;
  /** å¼å¸¸ææ æåå  */
  invalidReason?: string;
}
