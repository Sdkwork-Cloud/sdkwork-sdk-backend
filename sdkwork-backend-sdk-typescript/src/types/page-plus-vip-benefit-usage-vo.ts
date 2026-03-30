import type { PageableObject } from './pageable-object';
import type { PlusVipBenefitUsageVO } from './plus-vip-benefit-usage-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipBenefitUsageVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipBenefitUsageVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
