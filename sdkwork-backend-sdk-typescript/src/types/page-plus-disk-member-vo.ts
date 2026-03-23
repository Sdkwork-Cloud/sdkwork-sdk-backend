import type { PageableObject } from './pageable-object';
import type { PlusDiskMemberVO } from './plus-disk-member-vo';
import type { SortObject } from './sort-object';

export interface PagePlusDiskMemberVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusDiskMemberVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
