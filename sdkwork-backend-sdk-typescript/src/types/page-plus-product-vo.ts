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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
