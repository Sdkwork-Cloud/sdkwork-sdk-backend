import type { RtcAccessRuleVO } from './rtc-access-rule-vo';

export interface PageResultRtcAccessRuleVO {
  list?: RtcAccessRuleVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
