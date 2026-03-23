import type { PageableObject } from './pageable-object';
import type { PlusPartnerVO } from './plus-partner-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPartnerVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPartnerVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
