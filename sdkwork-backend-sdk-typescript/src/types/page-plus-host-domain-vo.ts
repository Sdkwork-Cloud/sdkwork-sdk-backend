import type { PageableObject } from './pageable-object';
import type { PlusHostDomainVO } from './plus-host-domain-vo';
import type { SortObject } from './sort-object';

export interface PagePlusHostDomainVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusHostDomainVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
