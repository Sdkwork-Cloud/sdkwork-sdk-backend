import type { PageableObject } from './pageable-object';
import type { PlusSystemInvoiceVO } from './plus-system-invoice-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSystemInvoiceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusSystemInvoiceVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
