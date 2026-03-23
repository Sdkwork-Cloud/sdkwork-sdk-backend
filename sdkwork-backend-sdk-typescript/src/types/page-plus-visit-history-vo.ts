import type { PageableObject } from './pageable-object';
import type { PlusVisitHistoryVO } from './plus-visit-history-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVisitHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVisitHistoryVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
