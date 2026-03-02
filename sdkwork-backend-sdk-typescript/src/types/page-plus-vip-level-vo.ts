import type { PageableObject } from './pageable-object';
import type { PlusVipLevelVO } from './plus-vip-level-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipLevelVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipLevelVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
