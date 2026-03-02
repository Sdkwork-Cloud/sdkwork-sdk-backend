import type { PageableObject } from './pageable-object';
import type { PlusVipPackGroupVO } from './plus-vip-pack-group-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPackGroupVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipPackGroupVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
