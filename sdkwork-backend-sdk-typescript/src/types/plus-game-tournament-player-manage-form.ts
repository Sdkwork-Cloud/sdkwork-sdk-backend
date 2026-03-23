/** æ£çæ¸¸æèµäºåèµèç®¡çè¡¨å */
export interface PlusGameTournamentPlayerManageForm {
  /** åèµç¶æ */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** ç§å­ä½ */
  seedNo?: number;
  /** æç»åæ¬¡ */
  rankNo?: number;
  /** éä¼å· */
  teamNo?: number;
  /** èµäºæç»©å¼ */
  scoreValue?: number;
  /** èµäºææå¯¹å±æ° */
  totalMatchCount?: number;
  /** èåºæ° */
  winCount?: number;
  /** è´åºæ° */
  loseCount?: number;
}
