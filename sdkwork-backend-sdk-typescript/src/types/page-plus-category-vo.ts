import type { PageableObject } from './pageable-object';
import type { PlusCategoryVO } from './plus-category-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCategoryVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCategoryVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
