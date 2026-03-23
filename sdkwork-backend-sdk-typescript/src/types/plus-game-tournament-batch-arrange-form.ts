import type { PlusGameTournamentBatchArrangePlayerForm } from './plus-game-tournament-batch-arrange-player-form';

/** æ£çæ¸¸æèµäºåèµèæ¹éç¼æè¡¨å */
export interface PlusGameTournamentBatchArrangeForm {
  /** ç¨æ·IDéåï¼ä¸ºç©ºè¡¨ç¤ºå¯¹èµäºä¸å¨é¨åèµèæ§è¡ */
  userIds?: number[];
  /** æ¾å¼ç¼æé¡¹åè¡¨ï¼æåè¡¨é¡ºåºç¼æï¼å­å¨æ¶ä¼åçæ */
  arrangePlayers?: PlusGameTournamentBatchArrangePlayerForm[];
  /** ç§å­ä½èµ·å§å¼ï¼ä¸ºç©ºæ¶èªå¨è¡æ¥ç°ææå¤§ç§å­ä½ */
  seedNoStart?: number;
  /** éä¼å·èµ·å§å¼ */
  teamNoStart?: number;
  /** æ¯ç»äººæ°ï¼ç¨äºèªå¨ç¼æéä¼å· */
  groupSize?: number;
  /** æ¯å¦è¦çå·²æç§å­ä½ */
  overwriteExistingSeedNo?: boolean;
  /** æ¯å¦è¦çå·²æéä¼å· */
  overwriteExistingTeamNo?: boolean;
}
