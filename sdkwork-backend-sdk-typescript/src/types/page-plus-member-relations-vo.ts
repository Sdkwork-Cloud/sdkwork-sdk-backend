import type { PageableObject } from './pageable-object';
import type { PlusMemberRelationsVO } from './plus-member-relations-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberRelationsVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusMemberRelationsVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
