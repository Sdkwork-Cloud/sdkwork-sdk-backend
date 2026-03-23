import type { PagePlusGameGrowthRecordVO } from './page-plus-game-growth-record-vo';

/** APIè°ç¨ç»æ */
export interface PlusApiResultPagePlusGameGrowthRecordVO {
  /** Response data */
  data: PagePlusGameGrowthRecordVO;
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
