import type { PageableObject } from './pageable-object';
import type { PlusHostDomainVO } from './plus-host-domain-vo';
import type { SortObject } from './sort-object';

export interface PagePlusHostDomainVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusHostDomainVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
