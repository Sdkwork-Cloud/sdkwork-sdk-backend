import type { PageableObject } from './pageable-object';
import type { PlusShareVisitRecordVO } from './plus-share-visit-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShareVisitRecordVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusShareVisitRecordVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
