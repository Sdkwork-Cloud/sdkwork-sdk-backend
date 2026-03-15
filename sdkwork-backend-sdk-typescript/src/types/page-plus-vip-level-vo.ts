import type { PageableObject } from './pageable-object';
import type { PlusVipLevelVO } from './plus-vip-level-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipLevelVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipLevelVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
