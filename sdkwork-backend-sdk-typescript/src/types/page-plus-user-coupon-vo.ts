import type { PageableObject } from './pageable-object';
import type { PlusUserCouponVO } from './plus-user-coupon-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserCouponVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusUserCouponVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
