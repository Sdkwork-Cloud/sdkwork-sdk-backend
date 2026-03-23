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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
