import type { PageableObject } from './pageable-object';
import type { PlusVipUserVO } from './plus-vip-user-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipUserVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipUserVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
