import type { PageableObject } from './pageable-object';
import type { PlusInvokeRecordVO } from './plus-invoke-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusInvokeRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusInvokeRecordVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
