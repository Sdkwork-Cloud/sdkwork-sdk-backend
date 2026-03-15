import type { PageableObject } from './pageable-object';
import type { PlusVipRechargeVO } from './plus-vip-recharge-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipRechargeVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipRechargeVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
