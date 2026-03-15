import type { PageableObject } from './pageable-object';
import type { PlusVipPackGroupVO } from './plus-vip-pack-group-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPackGroupVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipPackGroupVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
