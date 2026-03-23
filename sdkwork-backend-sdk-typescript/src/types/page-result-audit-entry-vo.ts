import type { AuditEntryVO } from './audit-entry-vo';

export interface PageResultAuditEntryVO {
  list?: AuditEntryVO[];
  total?: number;
  page?: number;
  pageSize?: number;
  size?: number;
  totalPages?: number;
}
