import type { PageableObject } from './pageable-object';
import type { PlusMemberRelationsVO } from './plus-member-relations-vo';
import type { SortObject } from './sort-object';

export interface PagePlusMemberRelationsVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusMemberRelationsVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
