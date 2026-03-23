/** æ£çæ¸¸æèµäºåèµèæ¹éç¶æé¡¹ */
export interface PlusGameTournamentBatchStatusPlayerForm {
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** ç©å®¶ç¶æï¼ä¸ºç©ºæ¶ç»§æ¿æ¹éé»è®¤ç¶æ */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** æ¾å¼åæ¬¡ï¼ä»æ·æ±°/å®èµç¶æåè®¸å¡«å */
  rankNo?: number;
  /** èµäºæç»©å¼ */
  scoreValue?: number;
  /** èµäºææå¯¹å±æ° */
  totalMatchCount?: number;
  /** èåºæ° */
  winCount?: number;
  /** è´åºæ° */
  loseCount?: number;
}
