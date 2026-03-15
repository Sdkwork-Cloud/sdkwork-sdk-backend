import type { PlusGameLeaderboardEntryVO } from './plus-game-leaderboard-entry-vo';

/** API调用结果 */
export interface PlusApiResultPlusGameLeaderboardEntryVO {
  /** Response data */
  data: PlusGameLeaderboardEntryVO;
  /** Response code: 2000=success, 4xxx=business failure, 5xxx=server error */
  code: string;
  /** Business message */
  msg: string;
  /** Request identifier */
  requestId: string;
  /** Client IP address */
  ip?: string;
  /** Server hostname */
  hostname?: string;
  /** Business error name */
  errorName: string;
}
