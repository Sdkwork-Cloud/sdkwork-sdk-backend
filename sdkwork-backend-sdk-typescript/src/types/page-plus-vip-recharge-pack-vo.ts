import type { PageableObject } from './pageable-object';
import type { PlusVipRechargePackVO } from './plus-vip-recharge-pack-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipRechargePackVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipRechargePackVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
