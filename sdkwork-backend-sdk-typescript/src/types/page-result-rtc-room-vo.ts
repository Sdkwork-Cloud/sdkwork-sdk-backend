import type { RtcRoomVO } from './rtc-room-vo';

export interface PageResultRtcRoomVO {
  list?: RtcRoomVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
