import type { PageableObject } from './pageable-object';
import type { PlusCouponVO } from './plus-coupon-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCouponVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCouponVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
