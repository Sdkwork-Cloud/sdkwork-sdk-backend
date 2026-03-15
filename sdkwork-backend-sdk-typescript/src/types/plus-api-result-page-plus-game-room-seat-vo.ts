import type { PagePlusGameRoomSeatVO } from './page-plus-game-room-seat-vo';

/** API调用结果 */
export interface PlusApiResultPagePlusGameRoomSeatVO {
  /** Response data */
  data: PagePlusGameRoomSeatVO;
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
