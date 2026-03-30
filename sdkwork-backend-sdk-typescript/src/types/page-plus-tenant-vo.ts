import type { PageableObject } from './pageable-object';
import type { PlusTenantVO } from './plus-tenant-vo';
import type { SortObject } from './sort-object';

export interface PagePlusTenantVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusTenantVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
