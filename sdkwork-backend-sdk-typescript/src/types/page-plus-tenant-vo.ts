import type { PageableObject } from './pageable-object';
import type { PlusTenantVO } from './plus-tenant-vo';
import type { SortObject } from './sort-object';

export interface PagePlusTenantVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusTenantVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
