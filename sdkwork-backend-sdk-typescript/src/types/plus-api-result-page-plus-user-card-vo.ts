import type { PagePlusUserCardVO } from './page-plus-user-card-vo';

/** APIè°ç¨ç»æ */
export interface PlusApiResultPagePlusUserCardVO {
  /** Response data */
  data: PagePlusUserCardVO;
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
