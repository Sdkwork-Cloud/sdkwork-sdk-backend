import type { PageableObject } from './pageable-object';
import type { PlusVipPackVO } from './plus-vip-pack-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPackVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipPackVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
