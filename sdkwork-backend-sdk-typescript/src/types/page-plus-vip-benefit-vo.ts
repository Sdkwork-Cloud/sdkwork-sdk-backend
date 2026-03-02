import type { PageableObject } from './pageable-object';
import type { PlusVipBenefitVO } from './plus-vip-benefit-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipBenefitVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipBenefitVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
