import type { PageableObject } from './pageable-object';
import type { PlusDiskMemberVO } from './plus-disk-member-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDiskMemberVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusDiskMemberVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
