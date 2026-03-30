import type { PageableObject } from './pageable-object';
import type { PlusVipUserVO } from './plus-vip-user-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipUserVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipUserVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
