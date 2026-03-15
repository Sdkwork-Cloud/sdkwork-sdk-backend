import type { PageableObject } from './pageable-object';
import type { PlusAccountHistoryVO } from './plus-account-history-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAccountHistoryVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAccountHistoryVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
