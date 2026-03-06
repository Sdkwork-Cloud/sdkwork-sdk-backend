import type { PageableObject } from './pageable-object';
import type { PlusProductVO } from './plus-product-vo';
import type { SortObject } from './sort-object';

export interface PagePlusProductVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusProductVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
