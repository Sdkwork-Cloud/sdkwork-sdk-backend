import type { PageableObject } from './pageable-object';
import type { PlusVipBenefitUsageVO } from './plus-vip-benefit-usage-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipBenefitUsageVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipBenefitUsageVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
