import type { PageableObject } from './pageable-object';
import type { PlusVipRechargeVO } from './plus-vip-recharge-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipRechargeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipRechargeVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
