import type { PageableObject } from './pageable-object';
import type { PlusPaymentVO } from './plus-payment-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPaymentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPaymentVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
