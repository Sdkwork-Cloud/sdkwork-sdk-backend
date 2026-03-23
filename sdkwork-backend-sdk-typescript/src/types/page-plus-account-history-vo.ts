import type { PageableObject } from './pageable-object';
import type { PlusAccountHistoryVO } from './plus-account-history-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAccountHistoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAccountHistoryVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
