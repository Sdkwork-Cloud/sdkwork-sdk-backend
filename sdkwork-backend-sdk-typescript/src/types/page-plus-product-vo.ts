import type { PageableObject } from './pageable-object';
import type { PlusProductVO } from './plus-product-vo';
import type { SortObject } from './sort-object';

export interface PagePlusProductVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusProductVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
