import type { PageableObject } from './pageable-object';
import type { PlusVipUserVO } from './plus-vip-user-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipUserVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipUserVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
