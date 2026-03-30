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
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
