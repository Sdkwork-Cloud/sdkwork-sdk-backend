import type { PageableObject } from './pageable-object';
import type { PlusShareVisitRecordVO } from './plus-share-visit-record-vo';
import type { SortObject } from './sort-object';

export interface PagePlusShareVisitRecordVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusShareVisitRecordVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
