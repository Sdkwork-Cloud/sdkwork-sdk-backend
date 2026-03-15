import type { PageableObject } from './pageable-object';
import type { PlusCouponTemplateVO } from './plus-coupon-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCouponTemplateVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCouponTemplateVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
