import type { PageableObject } from './pageable-object';
import type { PlusVipPackVO } from './plus-vip-pack-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPackVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipPackVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
