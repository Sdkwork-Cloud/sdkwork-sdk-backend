import type { PageableObject } from './pageable-object';
import type { PlusPaymentVO } from './plus-payment-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPaymentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPaymentVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
