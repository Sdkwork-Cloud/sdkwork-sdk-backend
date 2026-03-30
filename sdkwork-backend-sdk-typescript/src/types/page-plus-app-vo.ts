import type { PageableObject } from './pageable-object';
import type { PlusAppVO } from './plus-app-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAppVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAppVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
