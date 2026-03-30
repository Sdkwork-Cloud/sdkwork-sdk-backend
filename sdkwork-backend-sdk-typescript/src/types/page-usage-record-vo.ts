import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';
import type { UsageRecordVO } from './usage-record-vo';

export interface PageUsageRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: UsageRecordVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
