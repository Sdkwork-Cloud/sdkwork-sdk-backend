/** Tenant list query form */
export interface PlusTenantQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** Keyword for fuzzy search on tenant name/code */
  keyword?: string;
  /** Filter by tenant status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
}
