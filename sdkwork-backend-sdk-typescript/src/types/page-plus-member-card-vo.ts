import type { PageableObject } from './pageable-object';
import type { PlusMemberCardVO } from './plus-member-card-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberCardVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMemberCardVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
