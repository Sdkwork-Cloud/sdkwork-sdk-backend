import type { PageableObject } from './pageable-object';
import type { PlusCouponVO } from './plus-coupon-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCouponVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCouponVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
