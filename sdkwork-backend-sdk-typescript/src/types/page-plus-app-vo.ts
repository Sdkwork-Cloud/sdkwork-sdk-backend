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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
