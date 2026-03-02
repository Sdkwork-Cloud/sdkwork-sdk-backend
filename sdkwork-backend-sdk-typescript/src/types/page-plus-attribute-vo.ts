import type { PageableObject } from './pageable-object';
import type { PlusAttributeVO } from './plus-attribute-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAttributeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAttributeVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
