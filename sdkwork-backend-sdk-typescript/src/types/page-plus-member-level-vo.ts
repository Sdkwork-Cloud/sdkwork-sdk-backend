import type { PageableObject } from './pageable-object';
import type { PlusMemberLevelVO } from './plus-member-level-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberLevelVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMemberLevelVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
