import type { PagePlusVoiceSpeakerVO } from './page-plus-voice-speaker-vo';

/** API调用结果 */
export interface PlusApiResultPagePlusVoiceSpeakerVO {
  /** Response data */
  data: PagePlusVoiceSpeakerVO;
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
