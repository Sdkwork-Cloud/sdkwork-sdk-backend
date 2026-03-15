import type { PageableObject } from './pageable-object';
import type { PlusVisitHistoryVO } from './plus-visit-history-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVisitHistoryVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVisitHistoryVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
