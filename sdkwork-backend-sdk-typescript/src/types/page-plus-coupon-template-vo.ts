import type { PageableObject } from './pageable-object';
import type { PlusCouponTemplateVO } from './plus-coupon-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCouponTemplateVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCouponTemplateVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
