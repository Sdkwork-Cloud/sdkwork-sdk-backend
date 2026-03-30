import type { PageableObject } from './pageable-object';
import type { PlusCouponTemplateVO } from './plus-coupon-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCouponTemplateVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCouponTemplateVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
