import type { PageableObject } from './pageable-object';
import type { PlusMemberRelationsVO } from './plus-member-relations-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberRelationsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMemberRelationsVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
