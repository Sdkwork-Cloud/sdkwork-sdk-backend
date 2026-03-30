import type { PageableObject } from './pageable-object';
import type { PlusTableVO } from './plus-table-vo';
import type { SortObject } from './sort-object';

export interface PagePlusTableVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusTableVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
