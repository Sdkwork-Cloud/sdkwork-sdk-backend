import type { PageableObject } from './pageable-object';
import type { PlusVipBenefitUsageVO } from './plus-vip-benefit-usage-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipBenefitUsageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipBenefitUsageVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
