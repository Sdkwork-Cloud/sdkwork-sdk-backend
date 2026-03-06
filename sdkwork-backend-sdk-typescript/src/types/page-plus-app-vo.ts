import type { PageableObject } from './pageable-object';
import type { PlusAppVO } from './plus-app-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAppVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAppVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
