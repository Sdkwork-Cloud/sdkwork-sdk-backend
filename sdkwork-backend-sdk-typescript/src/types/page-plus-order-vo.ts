import type { PageableObject } from './pageable-object';
import type { PlusOrderVO } from './plus-order-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOrderVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
