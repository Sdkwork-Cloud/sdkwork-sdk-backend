import type { PageableObject } from './pageable-object';
import type { PlusPaymentVO } from './plus-payment-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPaymentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPaymentVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
