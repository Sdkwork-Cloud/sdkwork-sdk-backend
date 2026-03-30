import type { PageableObject } from './pageable-object';
import type { PlusSystemInvoiceVO } from './plus-system-invoice-vo';
import type { SortObject } from './sort-object';

export interface PagePlusSystemInvoiceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusSystemInvoiceVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
