import type { PageableObject } from './pageable-object';
import type { PlusVipLevelVO } from './plus-vip-level-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipLevelVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipLevelVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
