import type { PageableObject } from './pageable-object';
import type { PlusShareVisitRecordVO } from './plus-share-visit-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShareVisitRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShareVisitRecordVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
