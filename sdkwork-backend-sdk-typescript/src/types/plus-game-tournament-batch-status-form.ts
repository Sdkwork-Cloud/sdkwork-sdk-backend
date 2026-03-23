import type { PlusGameTournamentBatchStatusPlayerForm } from './plus-game-tournament-batch-status-player-form';

/** æ£çæ¸¸æèµäºåèµèæ¹éç¶æç®¡çè¡¨å */
export interface PlusGameTournamentBatchStatusForm {
  /** ç¨æ·IDéåï¼ä¸ºç©ºè¡¨ç¤ºå¯¹èµäºä¸å¨é¨åèµèæ§è¡ */
  userIds?: number[];
  /** éç©å®¶ç¶æé¡¹åè¡¨ï¼å­å¨æ¶æåè¡¨é¡ºåºå¤çï¼å¹¶ä¼åäº userIds */
  playerItems?: PlusGameTournamentBatchStatusPlayerForm[];
  /** æ¹éé»è®¤åèµç¶æï¼éç©å®¶é¡¹æªè®¾ç½®ç¶ææ¶åéä½¿ç¨ */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
  /** èµ·å§åæ¬¡ï¼ä»å¨æ·æ±°/å®èµä¸æªæ¾å¼è®¾ç½®åæ¬¡æ¶æé¡ºåºåå¡« */
  startRankNo?: number;
}
