import type { PlusGameGrowthRewardClaimVO } from './plus-game-growth-reward-claim-vo';

/** APIè°ç¨ç»æ */
export interface PlusApiResultListPlusGameGrowthRewardClaimVO {
  /** Response data */
  data: PlusGameGrowthRewardClaimVO[];
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
