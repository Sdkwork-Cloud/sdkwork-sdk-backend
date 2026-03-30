import type { PageableObject } from './pageable-object';
import type { PlusOrderVO } from './plus-order-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrderVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
