import type { PageableObject } from './pageable-object';
import type { PlusVipPointChangeVO } from './plus-vip-point-change-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipPointChangeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipPointChangeVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
