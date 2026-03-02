import type { PageableObject } from './pageable-object';
import type { PlusMemberLevelVO } from './plus-member-level-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberLevelVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMemberLevelVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
