import type { PageableObject } from './pageable-object';
import type { PlusCategoryVO } from './plus-category-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCategoryVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCategoryVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
