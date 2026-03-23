import type { PageableObject } from './pageable-object';
import type { PlusPaymentVO } from './plus-payment-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPaymentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPaymentVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
