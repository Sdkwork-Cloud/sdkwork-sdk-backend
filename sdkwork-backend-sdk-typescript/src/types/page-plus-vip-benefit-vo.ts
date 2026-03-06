import type { PageableObject } from './pageable-object';
import type { PlusVipBenefitVO } from './plus-vip-benefit-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipBenefitVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipBenefitVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
