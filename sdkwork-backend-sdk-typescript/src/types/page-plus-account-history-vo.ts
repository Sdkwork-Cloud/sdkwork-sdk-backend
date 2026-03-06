import type { PageableObject } from './pageable-object';
import type { PlusAccountHistoryVO } from './plus-account-history-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAccountHistoryVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAccountHistoryVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
