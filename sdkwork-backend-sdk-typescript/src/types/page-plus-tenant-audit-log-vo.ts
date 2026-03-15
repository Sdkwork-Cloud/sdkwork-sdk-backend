import type { PageableObject } from './pageable-object';
import type { PlusTenantAuditLogVO } from './plus-tenant-audit-log-vo';
import type { SortObject } from './sort-object';

export interface PagePlusTenantAuditLogVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusTenantAuditLogVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
