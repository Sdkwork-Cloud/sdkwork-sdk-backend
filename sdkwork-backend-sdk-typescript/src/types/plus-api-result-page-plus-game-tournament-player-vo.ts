import type { PagePlusGameTournamentPlayerVO } from './page-plus-game-tournament-player-vo';

/** APIè°ç¨ç»æ */
export interface PlusApiResultPagePlusGameTournamentPlayerVO {
  /** Response data */
  data: PagePlusGameTournamentPlayerVO;
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
