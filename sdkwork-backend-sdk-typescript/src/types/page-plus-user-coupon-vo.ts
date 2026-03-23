import type { PageableObject } from './pageable-object';
import type { PlusUserCouponVO } from './plus-user-coupon-vo';
import type { SortObject } from './sort-object';

export interface PagePlusUserCouponVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusUserCouponVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
