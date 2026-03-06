import type { PageableObject } from './pageable-object';
import type { PlusMemberRelationsVO } from './plus-member-relations-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberRelationsVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMemberRelationsVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
