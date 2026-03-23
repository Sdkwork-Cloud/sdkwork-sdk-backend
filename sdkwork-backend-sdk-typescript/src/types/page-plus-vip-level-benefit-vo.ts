import type { PageableObject } from './pageable-object';
import type { PlusVipLevelBenefitVO } from './plus-vip-level-benefit-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipLevelBenefitVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVipLevelBenefitVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
