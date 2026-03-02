import type { PageableObject } from './pageable-object';
import type { PlusDiskMemberVO } from './plus-disk-member-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDiskMemberVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDiskMemberVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
