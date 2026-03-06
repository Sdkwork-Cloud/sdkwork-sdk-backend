import type { PageableObject } from './pageable-object';
import type { PlusPartnerVO } from './plus-partner-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPartnerVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPartnerVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
