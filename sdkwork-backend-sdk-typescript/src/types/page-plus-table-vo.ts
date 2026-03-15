import type { PageableObject } from './pageable-object';
import type { PlusTableVO } from './plus-table-vo';
import type { SortObject } from './sort-object';

export interface PagePlusTableVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusTableVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
