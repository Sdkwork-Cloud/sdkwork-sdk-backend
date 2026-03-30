import type { PageableObject } from './pageable-object';
import type { PlusInvokeRecordVO } from './plus-invoke-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusInvokeRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusInvokeRecordVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
