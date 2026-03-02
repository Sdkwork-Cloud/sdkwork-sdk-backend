import type { PageableObject } from './pageable-object';
import type { PlusMemberCardVO } from './plus-member-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberCardVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMemberCardVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
