import type { PageableObject } from './pageable-object';
import type { PlusVipLevelBenefitVO } from './plus-vip-level-benefit-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipLevelBenefitVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipLevelBenefitVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
