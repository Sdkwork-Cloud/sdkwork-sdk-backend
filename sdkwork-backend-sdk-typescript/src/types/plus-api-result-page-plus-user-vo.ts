import type { PagePlusUserVO } from './page-plus-user-vo';

/** APIè°ç¨ç»æ */
export interface PlusApiResultPagePlusUserVO {
  /** Response data */
  data: PagePlusUserVO;
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
