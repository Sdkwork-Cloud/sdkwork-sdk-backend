export interface AuditEntryVO {
  id?: string;
  type?: string;
  title?: string;
  description?: string;
  status?: string;
  operator?: string;
  time?: string;
  metadata?: Record<string, string>;
}
