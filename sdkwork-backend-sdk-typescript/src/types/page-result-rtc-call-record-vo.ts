import type { RtcCallRecordVO } from './rtc-call-record-vo';

export interface PageResultRtcCallRecordVO {
  list?: RtcCallRecordVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
