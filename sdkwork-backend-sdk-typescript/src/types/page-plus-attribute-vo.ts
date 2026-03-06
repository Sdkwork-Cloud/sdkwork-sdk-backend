import type { PageableObject } from './pageable-object';
import type { PlusAttributeVO } from './plus-attribute-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAttributeVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAttributeVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
