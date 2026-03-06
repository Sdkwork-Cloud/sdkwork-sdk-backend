import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { UsageRecordVO } from './usage-record-vo';

export interface PageUsageRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: UsageRecordVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
