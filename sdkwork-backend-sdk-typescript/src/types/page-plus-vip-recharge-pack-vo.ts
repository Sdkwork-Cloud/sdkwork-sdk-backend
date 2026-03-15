import type { PageableObject } from './pageable-object';
import type { PlusVipRechargePackVO } from './plus-vip-recharge-pack-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipRechargePackVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipRechargePackVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
