import type { PageableObject } from './pageable-object';
import type { PlusVipPointChangeVO } from './plus-vip-point-change-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPointChangeVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipPointChangeVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
