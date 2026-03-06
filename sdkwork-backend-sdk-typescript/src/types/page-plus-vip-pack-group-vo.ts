import type { PageableObject } from './pageable-object';
import type { PlusVipPackGroupVO } from './plus-vip-pack-group-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPackGroupVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipPackGroupVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
