import type { PageableObject } from './pageable-object';
import type { PlusVipLevelBenefitVO } from './plus-vip-level-benefit-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVipLevelBenefitVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusVipLevelBenefitVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
