/** Schema creation form */
export interface PlusSchemaForm {
  /** Schema name */
  name: string;
  /** Schema description */
  description?: string;
  /** Status */
  status: number;
  /** Table count */
  tableCount?: number;
  /** Last sync time */
  lastSyncTime?: string;
  /** Whether default schema */
  isDefault?: boolean;
  /** Datasource ID */
  datasourceId: number;
}
