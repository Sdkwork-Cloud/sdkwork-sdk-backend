import type { PageableObject } from './pageable-object';
import type { PlusTenantAuditLogVO } from './plus-tenant-audit-log-vo';
import type { SortObject } from './sort-object';

export interface PagePlusTenantAuditLogVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusTenantAuditLogVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
