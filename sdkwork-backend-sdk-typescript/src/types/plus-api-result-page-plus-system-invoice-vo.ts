import type { PagePlusSystemInvoiceVO } from './page-plus-system-invoice-vo';

/** APIè°ç¨ç»æ */
export interface PlusApiResultPagePlusSystemInvoiceVO {
  /** Response data */
  data: PagePlusSystemInvoiceVO;
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
