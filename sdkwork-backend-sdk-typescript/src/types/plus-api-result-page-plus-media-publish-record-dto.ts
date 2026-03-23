import type { PagePlusMediaPublishRecordDTO } from './page-plus-media-publish-record-dto';

/** APIè°ç¨ç»æ */
export interface PlusApiResultPagePlusMediaPublishRecordDTO {
  /** Response data */
  data: PagePlusMediaPublishRecordDTO;
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
